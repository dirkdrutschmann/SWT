public class Output {

private Database database;

public String getNameFromDatabase(int id){
    return database.getNameById(id);
}
}
