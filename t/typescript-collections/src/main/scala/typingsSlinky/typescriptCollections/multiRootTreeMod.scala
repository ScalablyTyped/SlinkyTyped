package typingsSlinky.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.typescriptCollections.anon.Nodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiRootTreeMod {
  
  @JSImport("typescript-collections/dist/lib/MultiRootTree", JSImport.Default)
  @js.native
  class default () extends MultiRootTree {
    def this(rootIds: js.Array[String]) = this()
    def this(rootIds: js.UndefOr[scala.Nothing], nodes: StringDictionary[js.Array[String]]) = this()
    def this(rootIds: js.Array[String], nodes: StringDictionary[js.Array[String]]) = this()
  }
  
  @js.native
  trait FlatTreeNode extends StObject {
    
    var childrenCount: Double = js.native
    
    var hasParent: Boolean = js.native
    
    var id: String = js.native
    
    var level: Double = js.native
  }
  object FlatTreeNode {
    
    @scala.inline
    def apply(childrenCount: Double, hasParent: Boolean, id: String, level: Double): FlatTreeNode = {
      val __obj = js.Dynamic.literal(childrenCount = childrenCount.asInstanceOf[js.Any], hasParent = hasParent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatTreeNode]
    }
    
    @scala.inline
    implicit class FlatTreeNodeMutableBuilder[Self <: FlatTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenCount(value: Double): Self = StObject.set(x, "childrenCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasParent(value: Boolean): Self = StObject.set(x, "hasParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiRootTree extends StObject {
    
    def createEmptyNodeIfNotExist(nodeKey: String): Unit = js.native
    
    def deleteId(id: String): Unit = js.native
    
    /* private */ def findNode(nodeKey: js.Any): js.Any = js.native
    
    /* private */ def findNodeId(nodeKey: js.Any, id: js.Any): js.Any = js.native
    
    /* private */ def findRootId(id: js.Any): js.Any = js.native
    
    def flatten(): js.Array[FlatTreeNode] = js.native
    
    def getNodes(): StringDictionary[js.Array[String]] = js.native
    
    def getObject(): Nodes = js.native
    
    def getRootIds(): js.Array[String] = js.native
    
    def initNodes(): Unit = js.native
    
    def initRootIds(): Unit = js.native
    
    def insertIdAfterId(belowId: String, insertId: String): Unit = js.native
    
    def insertIdBeforeId(beforeId: String, insertId: String): Unit = js.native
    
    def insertIdIntoId(insideId: String, insertId: String): Unit = js.native
    
    def insertIdIntoNode(nodeKey: String, id: String): Unit = js.native
    def insertIdIntoNode(nodeKey: String, id: String, position: Double): Unit = js.native
    
    def insertIdIntoRoot(id: String): Unit = js.native
    def insertIdIntoRoot(id: String, position: Double): Unit = js.native
    
    /* private */ def moveId(moveId: js.Any, beforeId: js.Any, direction: js.Any): js.Any = js.native
    
    def moveIdAfterId(moveId: String, afterId: String): Unit = js.native
    
    def moveIdBeforeId(moveId: String, beforeId: String): Unit = js.native
    
    def moveIdIntoId(moveId: String, insideId: String): Unit = js.native
    def moveIdIntoId(moveId: String, insideId: String, atStart: Boolean): Unit = js.native
    
    /* private */ def nodeAndSubNodesDelete(nodeKey: js.Any): js.Any = js.native
    
    /* private */ def nodeDelete(nodeKey: js.Any): js.Any = js.native
    
    /* private */ def nodeDeleteAtIndex(nodeKey: js.Any, index: js.Any): js.Any = js.native
    
    /* private */ def nodeInsertAtEnd(nodeKey: js.Any, id: js.Any): js.Any = js.native
    
    /* private */ def nodeInsertAtStart(nodeKey: js.Any, id: js.Any): js.Any = js.native
    
    /* private */ def nodeRefrencesDelete(id: js.Any): js.Any = js.native
    
    var nodes: StringDictionary[js.Array[String]] = js.native
    
    /* private */ def rootDelete(index: js.Any): js.Any = js.native
    
    /* private */ def rootDeleteId(id: js.Any): js.Any = js.native
    
    var rootIds: js.Array[String] = js.native
    
    /* private */ def rootInsertAtEnd(id: js.Any): js.Any = js.native
    
    /* private */ def rootInsertAtStart(id: js.Any): js.Any = js.native
    
    /* private */ def swapArrayElements(arr: js.Any, indexA: js.Any, indexB: js.Any): js.Any = js.native
    
    def swapRootIdWithRootId(rootId: String, withRootId: String): Unit = js.native
    
    def swapRootPositionWithRootPosition(swapRootPosition: Double, withRootPosition: Double): Unit = js.native
    
    def toObject(): Nodes = js.native
  }
}
