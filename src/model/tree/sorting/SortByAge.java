package model.tree.sorting;

import model.person.TreeNode;

import java.util.Comparator;

public class SortByAge<T extends TreeNode<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}