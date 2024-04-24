package model.writer;

import model.person.TreeNode;
import model.tree.FamilyTree;

import java.io.Serializable;

public interface Writable <T extends TreeNode<T>> {
    boolean writeTreeAsByteCode(Serializable outputObject);
    boolean writeSubjectAsByteCode(Serializable outputObject);
    FamilyTree<T> readTreeFromByteCodeFile();
    T readSubjectFromByteCodeFile();
}