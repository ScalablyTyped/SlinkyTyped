package typingsSlinky.senchaTouch.Ext.lib

import typingsSlinky.senchaTouch.Ext.IEvented
import typingsSlinky.senchaTouch.Ext.data.IModel
import typingsSlinky.senchaTouch.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent extends IEvented {
  /** [Method] Adds a CSS class or classes to this Component s rendered element
  		* @param cls String The CSS class to add.
  		* @param prefix String Optional prefix to add to each class.
  		* @param suffix String Optional suffix to add to each class.
  		*/
  var addCls: js.UndefOr[
    js.Function3[
      /* cls */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[String] = js.native
  /** [Config Option] (Number/String) */
  var border: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var bottom: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var centered: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/String[]) */
  var cls: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.Element/HTMLElement/String) */
  var contentEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Method] Disables this Component */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dock: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var docked: js.UndefOr[String] = js.native
  /** [Method] Enables this Component */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Mixed) */
  var enterAnimation: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Mixed) */
  var exitAnimation: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var floatingCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /** [Method] Prepares information on aligning this to component using alignment
  		* @param component Object
  		* @param alignment Object
  		*/
  var getAlignmentInfo: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Returns the value of baseCls
  		* @returns String
  		*/
  var getBaseCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of border
  		* @returns Number/String
  		*/
  var getBorder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of bottom
  		* @returns any
  		*/
  var getBottom: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of centered
  		* @returns Boolean
  		*/
  var getCentered: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of cls
  		* @returns any
  		*/
  var getCls: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of contentEl
  		* @returns Ext.Element/HTMLElement/String
  		*/
  var getContentEl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of disabledCls
  		* @returns String
  		*/
  var getDisabledCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of docked
  		* @returns String
  		*/
  var getDocked: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Retrieves the top level element representing this component
  		* @returns Ext.dom.Element
  		*/
  var getEl: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns the value of enterAnimation
  		* @returns String/Mixed
  		*/
  var getEnterAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of exitAnimation
  		* @returns String/Mixed
  		*/
  var getExitAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of flex
  		* @returns Number
  		*/
  var getFlex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of floatingCls
  		* @returns String
  		*/
  var getFloatingCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of height
  		* @returns Number/String
  		*/
  var getHeight: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  var getHidden: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of hiddenCls
  		* @returns String
  		*/
  var getHiddenCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of hideAnimation
  		* @returns String/Mixed
  		*/
  var getHideAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of html
  		* @returns String/Ext.Element/HTMLElement
  		*/
  var getHtml: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of itemId
  		* @returns String
  		*/
  var getItemId: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of left
  		* @returns Number/String
  		*/
  var getLeft: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of margin
  		* @returns Number/String
  		*/
  var getMargin: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of maxHeight
  		* @returns Number/String
  		*/
  var getMaxHeight: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of maxWidth
  		* @returns Number/String
  		*/
  var getMaxWidth: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of minHeight
  		* @returns Number/String
  		*/
  var getMinHeight: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of minWidth
  		* @returns Number/String
  		*/
  var getMinWidth: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of padding
  		* @returns Number/String
  		*/
  var getPadding: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the parent of this component if it has one
  		* @returns Ext.Component The parent of this component.
  		*/
  var getParent: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  var getPlugins: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of record
  		* @returns Ext.data.Model
  		*/
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Returns the value of renderTo
  		* @returns Ext.Element
  		*/
  var getRenderTo: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.IElement]] = js.native
  /** [Method] Returns the value of right
  		* @returns Number/String
  		*/
  var getRight: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of showAnimation
  		* @returns String/Mixed
  		*/
  var getShowAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the height and width of the Component
  		* @returns Object The current height and width of the Component.
  		*/
  var getSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of style
  		* @returns String/Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of styleHtmlCls
  		* @returns String
  		*/
  var getStyleHtmlCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of styleHtmlContent
  		* @returns Boolean
  		*/
  var getStyleHtmlContent: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of top
  		* @returns Number/String
  		*/
  var getTop: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of tpl
  		* @returns String/String[]/Ext.Template/Ext.XTemplate[]
  		*/
  var getTpl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of tplWriteMode
  		* @returns String
  		*/
  var getTplWriteMode: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of ui
  		* @returns String
  		*/
  var getUi: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of width
  		* @returns Number/String
  		*/
  var getWidth: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
  		* @returns String The xtype hierarchy string.
  		*/
  var getXTypes: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of zIndex
  		* @returns Number
  		*/
  var getZIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns true if this component has a parent
  		* @returns Boolean true if this component has a parent.
  		*/
  var hasParent: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number/String) */
  var height: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var hiddenCls: js.UndefOr[String] = js.native
  /** [Method] Hides this Component optionally using an animation
  		* @param animation Object/Boolean You can specify an animation here or a bool to use the hideAnimation config.
  		* @returns Ext.Component
  		*/
  var hide: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (String/Mixed) */
  var hideAnimation: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hideOnMaskTap: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Ext.Element/HTMLElement) */
  var html: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] Allows addition of behavior to the rendering phase  */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if this Component is currently disabled
  		* @returns Boolean true if currently disabled.
  		*/
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this Component is currently hidden
  		* @returns Boolean true if currently hidden.
  		*/
  var isHidden: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component.
  		* @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  var isXType: js.UndefOr[
    js.Function2[/* xtype */ js.UndefOr[String], /* shallow */ js.UndefOr[Boolean], Boolean]
  ] = js.native
  /** [Config Option] (String) */
  var itemId: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var layoutOnOrientationChange: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number/String) */
  var left: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var maxHeight: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var maxWidth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var minHeight: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var minWidth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var monitorOrientation: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.data.Model) */
  var record: js.UndefOr[IModel] = js.native
  /** [Method] Removes the given CSS class es from this Component s rendered element
  		* @param cls String The class(es) to remove.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  var removeCls: js.UndefOr[
    js.Function3[
      /* cls */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Ext.Element) */
  var renderTo: js.UndefOr[typingsSlinky.senchaTouch.Ext.IElement] = js.native
  /** [Method] Replaces specified classes with the newly specified classes
  		* @param oldCls String The class(es) to remove.
  		* @param newCls String The class(es) to add.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  var replaceCls: js.UndefOr[
    js.Function4[
      /* oldCls */ js.UndefOr[String], 
      /* newCls */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  var resetFloating: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number/String) */
  var right: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean/String/Object) */
  var scroll: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of baseCls
  		* @param baseCls String The new value.
  		*/
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of border
  		* @param border Number/String The new value.
  		*/
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of bottom
  		* @param bottom Number/String The new value.
  		*/
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of centered
  		* @param centered Boolean The new value.
  		*/
  var setCentered: js.UndefOr[js.Function1[/* centered */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String/String[] The new value.
  		*/
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of contentEl
  		* @param contentEl Ext.Element/HTMLElement/String The new value.
  		*/
  var setContentEl: js.UndefOr[js.Function1[/* contentEl */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of disabledCls
  		* @param disabledCls String The new value.
  		*/
  var setDisabledCls: js.UndefOr[js.Function1[/* disabledCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of docked
  		* @param docked String The new value.
  		*/
  var setDocked: js.UndefOr[js.Function1[/* docked */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of draggable
  		* @param draggable Object The new value.
  		*/
  var setDraggable: js.UndefOr[js.Function1[/* draggable */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of enterAnimation
  		* @param enterAnimation String/Mixed The new value.
  		*/
  var setEnterAnimation: js.UndefOr[js.Function1[/* enterAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of exitAnimation
  		* @param exitAnimation String/Mixed The new value.
  		*/
  var setExitAnimation: js.UndefOr[js.Function1[/* exitAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of flex
  		* @param flex Number The new value.
  		*/
  var setFlex: js.UndefOr[js.Function1[/* flex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Used to update the floating state of this component
  		* @param floating Boolean true if you want to float this component.
  		*/
  var setFloating: js.UndefOr[js.Function1[/* floating */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of floatingCls
  		* @param floatingCls String The new value.
  		*/
  var setFloatingCls: js.UndefOr[js.Function1[/* floatingCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of height
  		* @param height Number/String The new value.
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of hiddenCls
  		* @param hiddenCls String The new value.
  		*/
  var setHiddenCls: js.UndefOr[js.Function1[/* hiddenCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of hideAnimation
  		* @param hideAnimation String/Mixed The new value.
  		*/
  var setHideAnimation: js.UndefOr[js.Function1[/* hideAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of html
  		* @param html String/Ext.Element/HTMLElement The new value.
  		*/
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemId
  		* @param itemId String The new value.
  		*/
  var setItemId: js.UndefOr[js.Function1[/* itemId */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of left
  		* @param left Number/String The new value.
  		*/
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of margin
  		* @param margin Number/String The new value.
  		*/
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxHeight
  		* @param maxHeight Number/String The new value.
  		*/
  var setMaxHeight: js.UndefOr[js.Function1[/* maxHeight */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxWidth
  		* @param maxWidth Number/String The new value.
  		*/
  var setMaxWidth: js.UndefOr[js.Function1[/* maxWidth */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of minHeight
  		* @param minHeight Number/String The new value.
  		*/
  var setMinHeight: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of minWidth
  		* @param minWidth Number/String The new value.
  		*/
  var setMinWidth: js.UndefOr[js.Function1[/* minWidth */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of padding
  		* @param padding Number/String The new value.
  		*/
  var setPadding: js.UndefOr[js.Function1[/* padding */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of record
  		* @param record Ext.data.Model The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.native
  /** [Method] Sets the value of renderTo
  		* @param renderTo Ext.Element The new value.
  		*/
  var setRenderTo: js.UndefOr[
    js.Function1[/* renderTo */ js.UndefOr[typingsSlinky.senchaTouch.Ext.IElement], Unit]
  ] = js.native
  /** [Method] Sets the value of right
  		* @param right Number/String The new value.
  		*/
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method has moved to Ext Container  */
  var setScrollable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of showAnimation
  		* @param showAnimation String/Mixed The new value.
  		*/
  var setShowAnimation: js.UndefOr[js.Function1[/* showAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the size of the Component
  		* @param width Number The new width for the Component.
  		* @param height Number The new height for the Component.
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Sets the value of style
  		* @param style String/Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of styleHtmlCls
  		* @param styleHtmlCls String The new value.
  		*/
  var setStyleHtmlCls: js.UndefOr[js.Function1[/* styleHtmlCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of styleHtmlContent
  		* @param styleHtmlContent Boolean The new value.
  		*/
  var setStyleHtmlContent: js.UndefOr[js.Function1[/* styleHtmlContent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of top
  		* @param top Number/String The new value.
  		*/
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of tpl
  		* @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
  		*/
  var setTpl: js.UndefOr[js.Function1[/* tpl */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of tplWriteMode
  		* @param tplWriteMode String The new value.
  		*/
  var setTplWriteMode: js.UndefOr[js.Function1[/* tplWriteMode */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of ui
  		* @param ui String The new value.
  		*/
  var setUi: js.UndefOr[js.Function1[/* ui */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of width
  		* @param width Number/String The new value.
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of zIndex
  		* @param zIndex Number The new value.
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zIndex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Shows this component optionally using an animation
  		* @param animation Object/Boolean You can specify an animation here or a bool to use the showAnimation config.
  		* @returns Ext.Component
  		*/
  var show: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (String/Mixed) */
  var showAnimation: js.UndefOr[js.Any] = js.native
  /** [Method] Shows this component by another component
  		* @param component Ext.Component The target component to show this component by.
  		* @param alignment String The specific alignment.
  		*/
  var showBy: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[this.type], /* alignment */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var stopMaskTapEvent: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var styleHtmlCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var styleHtmlContent: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number/String) */
  var top: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/String[]/Ext.Template/Ext.XTemplate[]) */
  var tpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var ui: js.UndefOr[String] = js.native
  /** [Method] Walks up the ownerCt axis looking for an ancestor Container which matches the passed simple selector
  		* @param selector String The simple selector to test.
  		* @returns Ext.Container The matching ancestor Container (or undefined if no match was found).
  		*/
  var up: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[String], typingsSlinky.senchaTouch.Ext.IContainer]
  ] = js.native
  /** [Method] Updates the HTML content of the Component  */
  var update: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the styleHtmlCls configuration
  		* @param newHtmlCls Object
  		* @param oldHtmlCls Object
  		*/
  var updateStyleHtmlCls: js.UndefOr[
    js.Function2[/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number/String) */
  var width: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String[]) */
  var xtype: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.native
}

object IComponent {
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCls(
      value: (/* cls */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAddCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCls")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCls")(js.undefined)
        ret
    }
    @scala.inline
    def withDock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(js.undefined)
        ret
    }
    @scala.inline
    def withDocked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docked")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withExitAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withFlex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withFloating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingCls")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAlignmentInfo(value: (/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignmentInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAlignmentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignmentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBaseCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBorder(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBottom(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCentered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCentered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCentered")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCls(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContentEl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetContentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisabledCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisabledCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisabledCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisabledCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDocked(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocked")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEl(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnterAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnterAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnterAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetExitAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExitAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetExitAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExitAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFlex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFloatingCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloatingCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFloatingCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloatingCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHidden(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHiddenCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHiddenCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHiddenCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHiddenCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHideAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHideAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHideAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHideAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHtml(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLeft(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMargin(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMargin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxHeight(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxWidth(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinHeight(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinWidth(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPadding(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParent(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPlugins(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlugins")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecord(value: () => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRenderTo(value: () => typingsSlinky.senchaTouch.Ext.IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRenderTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderTo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRight(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetShowAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShowAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetShowAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShowAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyle(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyleHtmlCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleHtmlCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStyleHtmlCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleHtmlCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyleHtmlContent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleHtmlContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStyleHtmlContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleHtmlContent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTop(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTop")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTpl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTpl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTplWriteMode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTplWriteMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTplWriteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTplWriteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUi(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUi")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUi")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXTypes(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetZIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withHasParent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasParent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenCls")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: /* animation */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnMaskTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnMaskTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnMaskTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnMaskTap")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHidden(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsXType(value: (/* xtype */ js.UndefOr[String], /* shallow */ js.UndefOr[Boolean]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsXType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXType")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutOnOrientationChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutOnOrientationChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutOnOrientationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutOnOrientationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitorOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(
      value: (/* cls */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRemoveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTo(value: typingsSlinky.senchaTouch.Ext.IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceCls(
      value: (/* oldCls */ js.UndefOr[String], /* newCls */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceCls")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutReplaceCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceCls")(js.undefined)
        ret
    }
    @scala.inline
    def withResetFloating(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetFloating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResetFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetFloating")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBaseCls(value: /* baseCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBaseCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBaseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBorder(value: /* border */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBottom(value: /* bottom */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCentered(value: /* centered */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCentered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCentered")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetContentEl(value: /* contentEl */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentEl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetContentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabledCls(value: /* disabledCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabledCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabledCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabledCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDocked(value: /* docked */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDraggable(value: /* draggable */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDraggable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnterAnimation(value: /* enterAnimation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnterAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnterAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExitAnimation(value: /* exitAnimation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExitAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetExitAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExitAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFlex(value: /* flex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFloating(value: /* floating */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloating")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFloatingCls(value: /* floatingCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloatingCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFloatingCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloatingCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: /* height */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHiddenCls(value: /* hiddenCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHiddenCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHideAnimation(value: /* hideAnimation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHideAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHideAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHideAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHtml(value: /* html */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemId(value: /* itemId */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLeft(value: /* left */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMargin(value: /* margin */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMargin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxHeight(value: /* maxHeight */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxWidth(value: /* maxWidth */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinHeight(value: /* minHeight */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinWidth(value: /* minWidth */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPadding(value: /* padding */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPlugins(value: /* plugins */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlugins")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecord(value: /* record */ js.UndefOr[IModel] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRenderTo(value: /* renderTo */ js.UndefOr[typingsSlinky.senchaTouch.Ext.IElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRenderTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRenderTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRenderTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRight(value: /* right */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withSetShowAnimation(value: /* showAnimation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShowAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetShowAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShowAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStyleHtmlCls(value: /* styleHtmlCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleHtmlCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStyleHtmlCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleHtmlCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStyleHtmlContent(value: /* styleHtmlContent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleHtmlContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStyleHtmlContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleHtmlContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTop(value: /* top */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTpl(value: /* tpl */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTplWriteMode(value: /* tplWriteMode */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTplWriteMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTplWriteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTplWriteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUi(value: /* ui */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUi")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: /* width */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetZIndex(value: /* zIndex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* animation */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBy(value: (/* component */ js.UndefOr[IComponent], /* alignment */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShowBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStopMaskTapEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopMaskTapEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopMaskTapEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopMaskTapEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleHtmlCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleHtmlCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleHtmlCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleHtmlCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleHtmlContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleHtmlContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleHtmlContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleHtmlContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
    @scala.inline
    def withTplWriteMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tplWriteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTplWriteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tplWriteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(value: /* selector */ js.UndefOr[String] => typingsSlinky.senchaTouch.Ext.IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateStyleHtmlCls(value: (/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStyleHtmlCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateStyleHtmlCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStyleHtmlCls")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xtype")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

