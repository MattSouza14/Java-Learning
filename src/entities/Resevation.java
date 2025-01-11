package entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resevation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Resevation(Date checkIn, Date checkOut, Integer roomNumber) throws DomainException{
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Data de checkout anterior ao checkin");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }


    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
       return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void uptadeDates(Date checkIn, Date checkOut) throws  DomainException{

        Date now = new Date();
        if (checkIn.before(now)|| checkOut.before(now)){
           throw new DomainException("Data anterior");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Data de checkout anterior ao checkin");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }
    @Override
    public String toString(){
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nigths";

    }
}
