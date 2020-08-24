package typingsSlinky.senchaTouch.global.Ext

import typingsSlinky.senchaTouch.Ext.IComponent
import typingsSlinky.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.ComponentQuery")
@js.native
class ComponentQuery ()
  extends typingsSlinky.senchaTouch.Ext.ComponentQuery

/* static members */
@JSGlobal("Ext.ComponentQuery")
@js.native
object ComponentQuery extends js.Object {
  /** [Method] Tests whether the passed Component matches the selector string
    * @param component Ext.Component The Component to test.
    * @param selector String The selector string to test against.
    * @returns Boolean true if the Component matches the selector.
    */
  def is(): Boolean = js.native
  def is(component: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
  def is(component: IComponent): Boolean = js.native
  def is(component: IComponent, selector: java.lang.String): Boolean = js.native
  /** [Method] Returns an array of matched Components from within the passed root object
    * @param selector String The selector string to filter returned Components
    * @param root Ext.Container The Container within which to perform the query. If omitted, all Components within the document are included in the search. This parameter may also be an array of Components to filter according to the selector.
    * @returns Ext.Component[] The matched Components.
    */
  def query(): typingsSlinky.senchaTouch.Ext.Array = js.native
  def query(selector: js.UndefOr[scala.Nothing], root: IContainer): typingsSlinky.senchaTouch.Ext.Array = js.native
  def query(selector: java.lang.String): typingsSlinky.senchaTouch.Ext.Array = js.native
  def query(selector: java.lang.String, root: IContainer): typingsSlinky.senchaTouch.Ext.Array = js.native
}

