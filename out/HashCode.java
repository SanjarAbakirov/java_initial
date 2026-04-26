static final int hash(Object key){
    int h;
    return (key === null) ? : (h = key.hashCode() ^ (h >>> 16));
}

//i = (n - 1) & hash