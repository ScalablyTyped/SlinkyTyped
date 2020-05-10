package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeInterface extends IBase {
  /** [Method] Insert node s as the last child node of this node
  		* @param node Ext.data.NodeInterface/Ext.data.NodeInterface[] The node or Array of nodes to append.
  		* @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed.
  		*/
  var appendChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Method] Cascades down the tree from this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var cascadeBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Property] (Object) */
  var childNodes: js.UndefOr[js.Any] = js.native
  /** [Method] Collapse this node
  		* @param recursive Function true to recursively collapse all the children.
  		* @param callback Function The function to execute once the collapse completes.
  		* @param scope Object The scope to run the callback in.
  		*/
  var collapse: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Creates a copy clone of this Node
  		* @param newId String A new id, defaults to this Node's id.
  		* @param deep Boolean If passed as true, all child Nodes are recursively copied into the new Node. If omitted or false, the copy will have no child Nodes.
  		* @returns Ext.data.NodeInterface A copy of this Node.
  		*/
  var copy: js.UndefOr[
    js.Function2[/* newId */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Destroys the node
  		* @param silent Object
  		*/
  @JSName("destroy")
  var destroy_INodeInterface: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Iterates the child nodes of this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in the iteration.
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Method] Expand this node
  		* @param recursive Function true to recursively expand all the children.
  		* @param callback Function The function to execute once the expand completes.
  		* @param scope Object The scope to run the callback in.
  		*/
  var expand: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Finds the first child that has the attribute with the specified value
  		* @param attribute String The attribute name.
  		* @param value Object The value to search for.
  		* @param deep Boolean true to search through nodes deeper than the immediate children.
  		* @returns Ext.data.NodeInterface The found child or null if none was found.
  		*/
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Finds the first child by a custom function
  		* @param fn Function A function which must return true if the passed Node is the required Node.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Node being tested.
  		* @param deep Boolean True to search through nodes deeper than the immediate children.
  		* @returns Ext.data.NodeInterface The found child or null if none was found.
  		*/
  var findChildBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Property] (Object) */
  var firstChild: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the child node at the specified index
  		* @param index Number
  		* @returns Ext.data.NodeInterface
  		*/
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Returns depth of this node the root node has a depth of 0
  		* @returns Number
  		*/
  var getDepth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the hierarchical path from the root of the current node
  		* @param field String The field to construct the path from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @returns String The node path
  		*/
  var getPath: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], String]
  ] = js.native
  /** [Method] Returns true if this node has one or more child nodes else false
  		* @returns Boolean
  		*/
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the index of a child node
  		* @param child Ext.data.NodeInterface
  		* @returns Number The index of the node or -1 if it was not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* child */ js.UndefOr[this.type], Double]] = js.native
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
  		* @param node Ext.data.NodeInterface The node to insert.
  		* @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended).
  		* @returns Ext.data.NodeInterface The inserted node.
  		*/
  var insertBefore: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* refNode */ js.UndefOr[this.type], this.type]
  ] = js.native
  /** [Method] Insert a node into this node
  		* @param index Number The zero-based index to insert the node at.
  		* @param node Ext.data.Model The node to insert.
  		* @returns Ext.data.Model The record you just inserted.
  		*/
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel], IModel]
  ] = js.native
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
  		* @returns Boolean
  		*/
  var isExpandable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is expanded
  		* @returns Boolean
  		*/
  var isExpanded: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is the first child of its parent
  		* @returns Boolean
  		*/
  var isFirst: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is the last child of its parent
  		* @returns Boolean
  		*/
  var isLast: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is a leaf
  		* @returns Boolean
  		*/
  var isLeaf: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is loaded
  		* @returns Boolean
  		*/
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is loading
  		* @returns Boolean
  		*/
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is the root node
  		* @returns Boolean
  		*/
  var isRoot: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is visible
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Object) */
  var lastChild: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var nextSibling: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var parentNode: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var previousSibling: js.UndefOr[js.Any] = js.native
  /** [Method] Removes this node from its parent
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Removes all child nodes from this node
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Removes a child node from this node
  		* @param node Ext.data.NodeInterface The node to remove.
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface The removed node.
  		*/
  var removeChild: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* destroy */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Replaces one child node in this node with another
  		* @param newChild Ext.data.NodeInterface The replacement node.
  		* @param oldChild Ext.data.NodeInterface The node to replace.
  		* @returns Ext.data.NodeInterface The replaced node.
  		*/
  var replaceChild: js.UndefOr[
    js.Function2[
      /* newChild */ js.UndefOr[this.type], 
      /* oldChild */ js.UndefOr[this.type], 
      this.type
    ]
  ] = js.native
  /** [Method] Sorts this nodes children using the supplied sort function
  		* @param sortFn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
  		* @param recursive Boolean Whether or not to apply this sort recursively.
  		* @param suppressEvent Boolean Set to true to not fire a sort event.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sortFn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Updates general data of this node like isFirst isLast depth
  		* @param silent Object
  		* @returns Boolean
  		*/
  var updateInfo: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Boolean]] = js.native
}

object INodeInterface {
  @scala.inline
  def apply(): INodeInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeInterface]
  }
  @scala.inline
  implicit class INodeInterfaceOps[Self <: INodeInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendChild(value: /* node */ js.UndefOr[js.Any] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withCascadeBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCascadeBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeBy")(js.undefined)
        ret
    }
    @scala.inline
    def withChildNodes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(
      value: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: (/* newId */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEachChild(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEachChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachChild")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(
      value: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFindChild(
      value: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChild")(js.undefined)
        ret
    }
    @scala.inline
    def withFindChildBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChildBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindChildBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChildBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstChild(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildAt(value: /* index */ js.UndefOr[Double] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetChildAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDepth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDepth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPath(value: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: /* child */ js.UndefOr[INodeInterface] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(
      value: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertChild(value: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel]) => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertChild")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAncestor(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAncestor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAncestor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpandable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFirst(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLast(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLast")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLeaf(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLeaf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoaded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRoot(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChild(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSibling(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSibling(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChild(
      value: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceChild(
      value: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplaceChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(
      value: (/* sortFn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateInfo(value: /* silent */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInfo")(js.undefined)
        ret
    }
  }
  
}

