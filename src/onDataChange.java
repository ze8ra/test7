import java.util.ArrayList;

public class onDataChange {
    public <DataSnapshot, EmptySeats> void onDataChange(DataSnapshot dataSnapshot) {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (DataSnapshot ds : dataSnapshot.getChildren()) {
            Object students = ds.getValue(Students.class);
            int studentSeatNum = students.getSeatnum();

            arrayList.add(Integer.valueOf(studentSeatNum));// save numbers from fire-base database into array list
        }
        // get missing values of the array list
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (i != arrayList.indexOf(j)) {
                    array.add(String.valueOf(i));
                }
            }
        }
        Object android;
        Object adapter = new ArrayAdapter<String>(EmptySeats.this, android.R.layout.simple_list_item_1, array);
        Object listView = null;
        listView.setAdapter(adapter);
    }
}
