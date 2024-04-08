package edu.guc.iluvmaadi;

import java.util.Hashtable;

public class Program {

    public static void main(String[] args) {
//        Index index = new Index();
//        index.insert(10, "X");
//        index.insert(20, "Y");
//        index.insert(30, "Z");
//        index.insert(10, "W");
//        index.insert(10, "V");
//
//        index.delete(10);
//        Index index2;
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("tree.class");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(index);
//
//            FileInputStream fileInputStream = new FileInputStream("tree.class");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            index2 = (Index) objectInputStream.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(index2.search(10, 20));

        try{
            DBApp dbApp = new DBApp();

            //System.out.println(dbApp.maximumRowsCountinPage);

            String strTableName = "Student";
            if (dbApp.getTable(strTableName) == null) {
                Hashtable<String, String> htblColNameType = new Hashtable<>( );
                htblColNameType.put("id", "java.lang.Integer");
                htblColNameType.put("name", "java.lang.String");
                htblColNameType.put("gpa", "java.lang.Double");
                dbApp.createTable( strTableName, "id", htblColNameType );

                dbApp.createIndex( strTableName, "gpa", "gpaIndex");
            }

//            dbApp.createIndex( strTableName, "gpa", "gpaIndex" );

//            for (int i = -20; i <= 1; i++) {
//                Hashtable<String, Object> htblColNameValue = new Hashtable<>( );
//                htblColNameValue.put("id", i );
//                htblColNameValue.put("name", "John Noor" + i );
//                htblColNameValue.put("gpa", 1.5 );
//                dbApp.insertIntoTable( strTableName , htblColNameValue );
//            }


//            SQLTerm[] arrSQLTerms;
//            arrSQLTerms = new SQLTerm[3];
//            arrSQLTerms[0] = new SQLTerm("Student", "name", ">=", "John Noor-10");
//            arrSQLTerms[1] = new SQLTerm("Student", "name", "<", "John Noor-15");
//            arrSQLTerms[2] = new SQLTerm("Student", "gpa", "<", 3.0);
//
//            String[]strarrOperators = new String[2];
//            strarrOperators[0] = "AND";
//            strarrOperators[1] = "AND";
//
//            Iterator<Tuple> iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
//            while (iterator.hasNext()) {
//                Tuple tuple = iterator.next();
//                System.out.println(tuple);
//            }
//
//            Hashtable<String, Object> htblColNameValue = new Hashtable<>( );
//            //htblColNameValue.put("name", "John Noor-13 Updated" );
//            //htblColNameValue.put("gpa", 2.5 );
//
//            dbApp.updateTable( strTableName, "-13", htblColNameValue );
//
//            iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
//            while (iterator.hasNext()) {
//                Tuple tuple = iterator.next();
//                System.out.println(tuple);
//            }
//
//
//            dbApp.deleteFromTable( strTableName, htblColNameValue);
//
//            iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
//            while (iterator.hasNext()) {
//                Tuple tuple = iterator.next();
//                System.out.println(tuple);
//            }
        }
        catch(Exception exp){
            //noinspection CallToPrintStackTrace
            exp.printStackTrace( );
        }
    }
}
