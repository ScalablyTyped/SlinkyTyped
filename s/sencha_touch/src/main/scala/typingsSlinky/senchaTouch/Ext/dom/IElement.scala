package typingsSlinky.senchaTouch.Ext.dom

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElement extends IObservable {
  /** [Property] (Number) */
  var DISPLAY: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var OFFSETS: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var VISIBILITY: js.UndefOr[Double] = js.native
  /** [Method] Adds the given CSS class es to this Element
  		* @param names String The CSS class(es) to add to this element.
  		* @param prefix String Prefix to prepend to each class.
  		* @param suffix String Suffix to append to each class.
  		* @returns Ext.dom.Element this
  		*/
  var addCls: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  /** [Method] Appends the passed element s to this element
  		* @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var appendChild: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Appends this element to the passed element
  		* @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var appendTo: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] More flexible version of setStyle for setting style properties
  		* @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
  		* @returns Ext.dom.Element this
  		*/
  var applyStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Selects a single direct child based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector.
  		* @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true)
  		*/
  var child: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns true if this element is an ancestor of the passed element
  		* @param element HTMLElement/String The element to check.
  		* @returns Boolean true if this element is an ancestor of el, else false.
  		*/
  var contains: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
  		* @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
  		* @param insertBefore HTMLElement a child element of this element.
  		* @param returnDom Boolean true to return the dom node instead of creating an Element.
  		* @returns Ext.dom.Element The new child element.
  		*/
  var createChild: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[HTMLElement], 
      /* returnDom */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Translates an element using CSS 3 in 2D  */
  var cssTranslate: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var defaultUnit: js.UndefOr[String] = js.native
  /** [Property] (HTMLElement) */
  var dom: js.UndefOr[HTMLElement] = js.native
  /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
  		* @param selector String The CSS selector.
  		* @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true).
  		*/
  var down: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Looks at this node and then at parent nodes for a match of the passed simple selector e g
  		* @param simpleSelector String The simple selector to test.
  		* @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 50 || document.body)
  		* @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
  		* @returns HTMLElement/null The matching DOM node (or null if no match was found).
  		*/
  var findParent: js.UndefOr[
    js.Function3[
      /* simpleSelector */ js.UndefOr[String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Looks at parent nodes for a match of the passed simple selector e g
  		* @param simpleSelector String The simple selector to test.
  		* @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 10 || document.body).
  		* @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
  		* @returns HTMLElement/null The matching DOM node (or null if no match was found).
  		*/
  var findParentNode: js.UndefOr[
    js.Function3[
      /* simpleSelector */ js.UndefOr[String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Gets the first child skipping text nodes
  		* @param selector String Find the next sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The first child or null.
  		*/
  var first: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Gets the x y coordinates to align this element with another element
  		* @param element Mixed The element to align to.
  		* @param position String The position to align to.
  		* @param offsets Array Offset the positioning by [x, y].
  		* @returns Array [x, y]
  		*/
  var getAlignToXY: js.UndefOr[
    js.Function3[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      Array
    ]
  ] = js.native
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
  		* @param anchor String The specified anchor position.
  		* @param local Boolean true to get the local (element top/left-relative) anchor position instead of page coordinates.
  		* @param size Object An object containing the size to use for calculating anchor position. {width: (target width), height: (target height)} (defaults to the element's current size)
  		* @returns Array [x, y] An array containing the element's x and y coordinates.
  		*/
  var getAnchorXY: js.UndefOr[
    js.Function3[
      /* anchor */ js.UndefOr[String], 
      /* local */ js.UndefOr[Boolean], 
      /* size */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.native
  /** [Method] Returns the value of an attribute from the element s underlying DOM node
  		* @param name String The attribute name.
  		* @param namespace String The namespace in which to look for the attribute.
  		* @returns String The attribute value.
  		*/
  var getAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String], String]
  ] = js.native
  /** [Method] Gets the width of the border s for the specified side s
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the border left width + the border right width.
  		* @returns Number The width of the sides passed added together
  		*/
  var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.native
  /** [Method] Gets the bottom Y coordinate of the element element Y position  element height
  		* @returns Number
  		*/
  var getBottom: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param contentBox Boolean If true a box for the content of the element is returned.
  		* @param local Boolean If true the element's left and top are returned instead of page x/y.
  		* @returns Object An object in the format
  		*/
  var getBox: js.UndefOr[
    js.Function2[/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns the innerHTML of an element
  		* @returns String
  		*/
  var getHTML: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the offset height of the element
  		* @param contentHeight Boolean true to get the height minus borders and padding.
  		* @returns Number The element's height.
  		*/
  var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[Boolean], Double]] = js.native
  /** [Method] Returns the innerHTML of an element
  		* @returns String
  		*/
  var getHtml: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Gets the left X coordinate
  		* @returns Number
  		*/
  var getLeft: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
  		* @param sides String Any combination of 'l', 'r', 't', 'b' to get the sum of those sides.
  		* @returns Object/Number
  		*/
  var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the offsets of this element from the passed element
  		* @param element Mixed The element to get the offsets from.
  		* @returns Array The XY page offsets (e.g. [100, -200])
  		*/
  var getOffsetsTo: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Retrieves the height of the element account for the top and bottom margins  */
  var getOuterHeight: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Retrieves the width of the element accounting for the left and right margins  */
  var getOuterWidth: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the width of the padding s for the specified side s
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
  		* @returns Number The padding of the sides passed added together.
  		*/
  var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.native
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param asRegion Boolean If true an Ext.util.Region will be returned.
  		* @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. So the result may also be used for setXY.
  		*/
  var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Gets the right X coordinate of the element element X position  element width
  		* @returns Number
  		*/
  var getRight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the Scroller instance of the first parent that has one  */
  var getScrollParent: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the size of the element
  		* @param contentSize Boolean true to get the width/size minus borders and padding.
  		* @returns Object An object containing the element's size:
  		*/
  var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Normalizes currentStyle and computedStyle
  		* @param prop String The style property whose value is returned.
  		* @returns String The current value of the style property for this element.
  		*/
  var getStyle: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], String]] = js.native
  /** [Method] Gets the top Y coordinate
  		* @returns Number
  		*/
  var getTop: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of the value attribute
  		* @param asNumber Boolean true to parse the value as a number.
  		* @returns String/Number
  		*/
  var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Returns the dimensions of the element available to lay content out in
  		* @returns Object Object describing width and height:
  		*/
  var getViewSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the offset width of the element
  		* @param contentWidth Boolean true to get the width minus borders and padding.
  		* @returns Number The element's width.
  		*/
  var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[Boolean], Double]] = js.native
  /** [Method] Gets the current X position of the element based on page coordinates
  		* @returns Number The X position of the element
  		*/
  var getX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the current position of the element based on page coordinates
  		* @returns Array The XY position of the element
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Gets the current Y position of the element based on page coordinates
  		* @returns Number The Y position of the element
  		*/
  var getY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param name String The CSS class to check for.
  		* @returns Boolean true if the class exists, else false.
  		*/
  var hasCls: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Hides this element  */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] Inserts this element after the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var insertAfter: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Inserts this element before the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var insertBefore: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Inserts an element as the first child of this element
  		* @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
  		* @returns Ext.dom.Element this
  		*/
  var insertFirst: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Inserts an HTML fragment into this element
  		* @param where String Where to insert the HTML in relation to this element - 'beforeBegin', 'afterBegin', 'beforeEnd', 'afterEnd'. See Ext.DomHelper.insertHtml for details.
  		* @param html String The HTML fragment
  		* @param returnEl Boolean true to return an Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The inserted node (or nearest related if more than 1 inserted).
  		*/
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[String], 
      /* html */ js.UndefOr[String], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element
  		* @param el String/HTMLElement/Ext.dom.Element/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
  		* @param where String 'before' or 'after'.
  		* @param returnDom Boolean true to return the raw DOM element instead of Ext.dom.Element.
  		* @returns Ext.dom.Element The inserted Element. If an array is passed, the last inserted element is returned.
  		*/
  var insertSibling: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* where */ js.UndefOr[String], 
      /* returnDom */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Returns true if this element matches the passed simple selector e g
  		* @param selector String The simple selector to test.
  		* @returns Boolean true if this element matches the selector, else false.
  		*/
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Determines if this element is a descendant of the passed in Element  */
  var isDescendent: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Checks if the current value of a style is equal to a given value
  		* @param style String property whose value is returned.
  		* @param value String to check against.
  		* @returns Boolean true for when the current value equals the given value.
  		*/
  var isStyle: js.UndefOr[
    js.Function2[/* style */ js.UndefOr[String], /* value */ js.UndefOr[String], Boolean]
  ] = js.native
  /** [Method] Returns true if the value of the given property is visually transparent
  		* @param prop String The style property whose value is to be tested.
  		* @returns Boolean true if the style property is visually transparent.
  		*/
  var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Gets the last child skipping text nodes
  		* @param selector String Find the previous sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The last child or null.
  		*/
  var last: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Puts a mask over this element to disable user interaction  */
  var mask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the next sibling skipping text nodes
  		* @param selector String Find the next sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw dom node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The next sibling or null.
  		*/
  var next: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector
  		* @param selector String Find a parent node that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The parent node or null.
  		*/
  var parent: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Gets the previous sibling skipping text nodes
  		* @param selector String Find the previous sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement/null The previous sibling or null.
  		*/
  var prev: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Removes all listeners for this object  */
  var purgeAllListeners: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector.
  		* @returns HTMLElement[] An array of the matched nodes.
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Array]] = js.native
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
  		* @param className String/String[] The CSS class to add, or an array of classes.
  		* @returns Ext.dom.Element this
  		*/
  var radioCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IElement: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Removes this element s DOM reference  */
  var remove: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Removes all listeners for this object  */
  var removeAllListeners: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Removes the given CSS class es from this Element
  		* @param names String The CSS class(es) to remove from this element.
  		* @param prefix String Prefix to prepend to each class to be removed.
  		* @param suffix String Suffix to append to each class to be removed.
  		* @returns Ext.dom.Element this
  		*/
  var removeCls: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  /** [Method] Forces the browser to repaint this element
  		* @returns Ext.dom.Element this
  		*/
  var repaint: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Replaces the passed element with this element
  		* @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var replace: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Replaces a CSS class on the element with another
  		* @param oldName String The CSS class to replace.
  		* @param newName String The replacement CSS class.
  		* @param prefix String Prefix to prepend to each class to be replaced.
  		* @param suffix String Suffix to append to each class to be replaced.
  		* @returns Ext.dom.Element this
  		*/
  var replaceCls: js.UndefOr[
    js.Function4[
      /* oldName */ js.UndefOr[String], 
      /* newName */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      this.type
    ]
  ] = js.native
  /** [Method] Replaces this element with the passed element
  		* @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
  		* @returns Ext.dom.Element This element.
  		*/
  var replaceWith: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Serializes a DOM form into a url encoded string
  		* @param form Object The form
  		* @returns String The url encoded form
  		*/
  var serializeForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
  		* @param attributes Object The object with the attributes.
  		* @param useSet Boolean false to override the default setAttribute to use expandos.
  		* @returns Ext.dom.Element this
  		*/
  var set: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Sets the element s CSS bottom style
  		* @param bottom String The bottom CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Sets the element s box
  		* @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
  		* @returns Ext.dom.Element this
  		*/
  var setBox: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the specified CSS class on this element s DOM node
  		* @param className String/Array The CSS class to set on this element.
  		*/
  var setCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var setHTML: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the height of this Element
  		* @param height Number/String The new height.
  		* @returns Ext.dom.Element this
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the element s left position directly using CSS style instead of setX
  		* @param left String The left CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Set the maximum height of this Element
  		* @param height Number/String The new maximum height.
  		* @returns Ext.dom.Element this
  		*/
  var setMaxHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Set the maximum width of this Element
  		* @param width Number/String The new maximum width.
  		* @returns Ext.dom.Element this
  		*/
  var setMaxWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Set the minimum height of this Element
  		* @param height Number/String The new minimum height.
  		* @returns Ext.dom.Element this
  		*/
  var setMinHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Set the minimum width of this Element
  		* @param width Number/String The new minimum width.
  		* @returns Ext.dom.Element this
  		*/
  var setMinWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the element s CSS right style
  		* @param right String The right CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Set the size of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.dom.Element this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.native
  /** [Method] Sets the element s top position directly using CSS style instead of setY
  		* @param top String The top CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Sets the element s top and left positions directly using CSS style  */
  var setTopLeft: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
  		* @param mode Object
  		* @returns Ext.dom.Element this
  		*/
  var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible.
  		* @returns Ext.Element this
  		*/
  var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Set the width of this Element
  		* @param width Number/String The new width.
  		* @returns Ext.dom.Element this
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the X position of the element based on page coordinates
  		* @param x Number The X position of the element
  		* @returns Ext.dom.Element this
  		*/
  var setX: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
  		* @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
  		* @returns Ext.dom.Element this
  		*/
  var setXY: js.UndefOr[js.Function1[/* pos */ js.UndefOr[Array], this.type]] = js.native
  /** [Method] Sets the Y position of the element based on page coordinates
  		* @param y Number The Y position of the element.
  		* @returns Ext.dom.Element this
  		*/
  var setY: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Shows this element  */
  var show: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
  		* @param className String The CSS class to toggle.
  		* @returns Ext.dom.Element this
  		*/
  var toggleCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Translates the passed page coordinates into left top CSS values for this element
  		* @param x Number/Array The page x or an array containing [x, y].
  		* @param y Number The page y, required if x is not an array.
  		* @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}.
  		*/
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], _]] = js.native
  /** [Method] Removes a previously applied mask  */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Walks up the dom looking for a parent node that matches the passed simple selector e g
  		* @param simpleSelector String The simple selector to test
  		* @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 10 || document.body).
  		* @returns Ext.dom.Element/null The matching DOM node (or null if no match was found).
  		*/
  var up: js.UndefOr[
    js.Function2[/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var update: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Creates and wraps this element with another element
  		* @param config Object DomHelper element config object for the wrapper element or null for an empty div
  		* @param domNode Boolean true to return the raw DOM element instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The newly created wrapper element.
  		*/
  var wrap: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean], _]
  ] = js.native
}

object IElement {
  @scala.inline
  def apply(): IElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElement]
  }
  @scala.inline
  implicit class IElementOps[Self <: IElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDISPLAY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDISPLAY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY")(js.undefined)
        ret
    }
    @scala.inline
    def withOFFSETS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFSETS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOFFSETS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFSETS")(js.undefined)
        ret
    }
    @scala.inline
    def withVISIBILITY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VISIBILITY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVISIBILITY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VISIBILITY")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCls(
      value: (/* names */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => IElement
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
    def withAppendChild(value: /* element */ js.UndefOr[js.Any] => IElement): Self = {
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
    def withAppendTo(value: /* el */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyStyles(value: /* styles */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withChild(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* element */ js.UndefOr[js.Any] => Boolean): Self = {
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
    def withCreateChild(
      value: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChild")(js.undefined)
        ret
    }
    @scala.inline
    def withCssTranslate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssTranslate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCssTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssTranslate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withDom(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.undefined)
        ret
    }
    @scala.inline
    def withDown(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withFindParent(
      value: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFindParentNode(
      value: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAlignToXY(
      value: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array]) => Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignToXY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetAlignToXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignToXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnchorXY(
      value: (/* anchor */ js.UndefOr[String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorXY")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetAnchorXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttribute(value: (/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBorderWidth(value: /* side */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBottom(value: () => Double): Self = {
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
    def withGetBox(value: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHTML(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHTML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: /* contentHeight */ js.UndefOr[Boolean] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLeft(value: () => Double): Self = {
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
    def withGetMargin(value: /* sides */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMargin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffsetsTo(value: /* element */ js.UndefOr[js.Any] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetsTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOffsetsTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetsTo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOuterHeight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOuterHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOuterHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOuterHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOuterWidth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOuterWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOuterWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOuterWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPadding(value: /* side */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageBox(value: /* asRegion */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPageBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRight(value: () => Double): Self = {
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
    def withGetScrollParent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollParent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSize(value: /* contentSize */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyle(value: /* prop */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTop(value: () => Double): Self = {
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
    def withGetValue(value: /* asNumber */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViewSize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViewSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: /* contentWidth */ js.UndefOr[Boolean] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXY(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getY")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCls(value: /* name */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
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
    def withInsertAfter(value: /* el */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(value: /* el */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFirst(value: /* element */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertHtml(
      value: (/* where */ js.UndefOr[String], /* html */ js.UndefOr[String], /* returnEl */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSibling(
      value: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSibling")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: /* selector */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDescendent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDescendent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDescendent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDescendent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStyle(value: (/* style */ js.UndefOr[String], /* value */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTransparent(value: /* prop */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransparent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransparent")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withPurgeAllListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeAllListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPurgeAllListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeAllListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: /* selector */ js.UndefOr[String] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioCls(value: /* className */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRadioCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAllListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemoveAllListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(
      value: (/* names */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => IElement
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
    def withRepaint(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRepaint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaint")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: /* element */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceCls(
      value: (/* oldName */ js.UndefOr[String], /* newName */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => IElement
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
    def withReplaceWith(value: /* el */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplaceWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeForm(value: /* form */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializeForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeForm")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBottom(value: /* bottom */ js.UndefOr[String] => IElement): Self = {
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
    def withSetBox(value: /* box */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBox")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* className */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetHTML(value: /* html */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: /* height */ js.UndefOr[js.Any] => IElement): Self = {
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
    def withSetLeft(value: /* left */ js.UndefOr[String] => IElement): Self = {
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
    def withSetMaxHeight(value: /* height */ js.UndefOr[js.Any] => IElement): Self = {
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
    def withSetMaxWidth(value: /* width */ js.UndefOr[js.Any] => IElement): Self = {
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
    def withSetMinHeight(value: /* height */ js.UndefOr[js.Any] => IElement): Self = {
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
    def withSetMinWidth(value: /* width */ js.UndefOr[js.Any] => IElement): Self = {
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
    def withSetRight(value: /* right */ js.UndefOr[String] => IElement): Self = {
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
    def withSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => IElement): Self = {
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
    def withSetStyle(value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTop(value: /* top */ js.UndefOr[String] => IElement): Self = {
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
    def withSetTopLeft(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTopLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTopLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVisibilityMode(value: /* mode */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibilityMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVisibilityMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibilityMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVisible(value: /* visible */ js.UndefOr[Boolean] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: /* width */ js.UndefOr[js.Any] => IElement): Self = {
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
    def withSetX(value: /* x */ js.UndefOr[Double] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXY(value: /* pos */ js.UndefOr[Array] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetY(value: /* y */ js.UndefOr[Double] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setY")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCls(value: /* className */ js.UndefOr[String] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCls")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslatePoints(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatePoints")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTranslatePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translatePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmask(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnmask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmask")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(value: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* html */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

