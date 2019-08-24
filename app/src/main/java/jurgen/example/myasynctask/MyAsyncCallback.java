package jurgen.example.myasynctask;

interface MyAsyncCallback {
    void onPreExecute();
    void onPostExecute(String text);
}