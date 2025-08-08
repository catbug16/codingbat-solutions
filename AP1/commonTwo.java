public int commonTwo(String[] a, String[] b) {
    int i = 0, j = 0;
    int count = 0;

    while (i < a.length && j < b.length) {
        if (a[i].equals(b[j])) {
            count++;

            String match = a[i]; 

         
            while (i < a.length && a[i].equals(match)) {
                i++;
            }
          
            while (j < b.length && b[j].equals(match)) {
                j++;
            }

        } else if (a[i].compareTo(b[j]) < 0) {
            i++;
        } else {
            j++;
        }
    }
    return count;
}

