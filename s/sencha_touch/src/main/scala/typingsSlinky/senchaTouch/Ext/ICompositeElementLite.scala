package typingsSlinky.senchaTouch.Ext

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompositeElementLite
  extends typingsSlinky.senchaTouch.Ext.dom.IElement {
  /** [Method] Adds elements to this Composite object
  		* @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
  		* @param root HTMLElement/String The root element of the query or id of the root.
  		* @returns Ext.dom.CompositeElementLite This Composite object.
  		*/
  var add: js.UndefOr[
    js.Function2[/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Adds the given CSS class es to this Element
  		* @param names String The CSS class(es) to add to this element.
  		* @param prefix String Prefix to prepend to each class.
  		* @param suffix String Suffix to append to each class.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("addCls")
  var addCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] fixes scope with flyweight
  		* @param eventName Object
  		* @param handler Object
  		* @param scope Object
  		* @param opt Object
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("addListener")
  var addListener_ICompositeElementLite: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* opt */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Method] Appends the passed element s to this element
  		* @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("appendChild")
  var appendChild_ICompositeElementLite: js.UndefOr[
    js.Function1[/* element */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Appends this element to the passed element
  		* @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("appendTo")
  var appendTo_ICompositeElementLite: js.UndefOr[
    js.Function1[/* el */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] More flexible version of setStyle for setting style properties
  		* @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("applyStyles")
  var applyStyles_ICompositeElementLite: js.UndefOr[
    js.Function1[/* styles */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Removes all elements  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
  		* @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
  		* @param insertBefore HTMLElement a child element of this element.
  		* @param returnDom Boolean true to return the dom node instead of creating an Element.
  		* @returns Ext.dom.Element The new child element.
  		*/
  @JSName("createChild")
  var createChild_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[HTMLElement], 
      /* returnDom */ js.UndefOr[Boolean], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Calls the passed function for each element in this composite
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[Array] = js.native
  /** [Method] Clears this Composite and adds the elements passed
  		* @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Filters this composite to only elements that match the passed selector
  		* @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var filter: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Returns the number of elements in this Composite
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Inserts this element after the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("insertAfter")
  var insertAfter_ICompositeElementLite: js.UndefOr[
    js.Function1[/* el */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Inserts this element before the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("insertBefore")
  var insertBefore_ICompositeElementLite: js.UndefOr[
    js.Function1[/* el */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Inserts an element as the first child of this element
  		* @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("insertFirst")
  var insertFirst_ICompositeElementLite: js.UndefOr[
    js.Function1[/* element */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element
  		* @param el String/HTMLElement/Ext.dom.Element/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
  		* @param where String 'before' or 'after'.
  		* @param returnDom Boolean true to return the raw DOM element instead of Ext.dom.Element.
  		* @returns Ext.dom.Element The inserted Element. If an array is passed, the last inserted element is returned.
  		*/
  @JSName("insertSibling")
  var insertSibling_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* where */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
  		* @param index Number
  		* @returns Ext.dom.Element
  		*/
  var item: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
  		* @param className String/String[] The CSS class to add, or an array of classes.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("radioCls")
  var radioCls_ICompositeElementLite: js.UndefOr[
    js.Function1[/* className */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Removes the given CSS class es from this Element
  		* @param names String The CSS class(es) to remove from this element.
  		* @param prefix String Prefix to prepend to each class to be removed.
  		* @param suffix String Suffix to append to each class to be removed.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("removeCls")
  var removeCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean true to also remove the element from the document
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Forces the browser to repaint this element
  		* @returns Ext.dom.Element this
  		*/
  @JSName("repaint")
  var repaint_ICompositeElementLite: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.dom.IElement]] = js.native
  /** [Method] Replaces a CSS class on the element with another
  		* @param oldName String The CSS class to replace.
  		* @param newName String The replacement CSS class.
  		* @param prefix String Prefix to prepend to each class to be replaced.
  		* @param suffix String Suffix to append to each class to be replaced.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("replaceCls")
  var replaceCls_ICompositeElementLite: js.UndefOr[
    js.Function4[
      /* oldName */ js.UndefOr[java.lang.String], 
      /* newName */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Replaces the specified element with the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
  		* @param replacement String/Ext.Element The id of an element or the Element itself.
  		* @param domReplace Boolean true to remove and replace the element in the document too.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Replaces this element with the passed element
  		* @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("replaceWith")
  var replaceWith_ICompositeElementLite: js.UndefOr[
    js.Function1[/* el */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Replaces the passed element with this element
  		* @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("replace")
  var replace_ICompositeElementLite: js.UndefOr[
    js.Function1[/* element */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
  		* @param selector String/HTMLElement[] The CSS selector or an array of elements
  		* @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
  		* @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
  		*/
  var select: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Sets the element s CSS bottom style
  		* @param bottom String The bottom CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setBottom")
  var setBottom_ICompositeElementLite: js.UndefOr[
    js.Function1[
      /* bottom */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Sets the element s box
  		* @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setBox")
  var setBox_ICompositeElementLite: js.UndefOr[
    js.Function1[/* box */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Set the height of this Element
  		* @param height Number/String The new height.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setHeight")
  var setHeight_ICompositeElementLite: js.UndefOr[
    js.Function1[/* height */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Sets the element s left position directly using CSS style instead of setX
  		* @param left String The left CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setLeft")
  var setLeft_ICompositeElementLite: js.UndefOr[
    js.Function1[
      /* left */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Set the maximum height of this Element
  		* @param height Number/String The new maximum height.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMaxHeight")
  var setMaxHeight_ICompositeElementLite: js.UndefOr[
    js.Function1[/* height */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Set the maximum width of this Element
  		* @param width Number/String The new maximum width.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMaxWidth")
  var setMaxWidth_ICompositeElementLite: js.UndefOr[
    js.Function1[/* width */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Set the minimum height of this Element
  		* @param height Number/String The new minimum height.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMinHeight")
  var setMinHeight_ICompositeElementLite: js.UndefOr[
    js.Function1[/* height */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Set the minimum width of this Element
  		* @param width Number/String The new minimum width.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMinWidth")
  var setMinWidth_ICompositeElementLite: js.UndefOr[
    js.Function1[/* width */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Sets the element s CSS right style
  		* @param right String The right CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setRight")
  var setRight_ICompositeElementLite: js.UndefOr[
    js.Function1[
      /* right */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Set the size of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setSize")
  var setSize_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setStyle")
  var setStyle_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Sets the element s top position directly using CSS style instead of setY
  		* @param top String The top CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setTop")
  var setTop_ICompositeElementLite: js.UndefOr[
    js.Function1[/* top */ js.UndefOr[java.lang.String], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
  		* @param mode Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setVisibilityMode")
  var setVisibilityMode_ICompositeElementLite: js.UndefOr[
    js.Function1[/* mode */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible.
  		* @returns Ext.Element this
  		*/
  @JSName("setVisible")
  var setVisible_ICompositeElementLite: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], IElement]] = js.native
  /** [Method] Set the width of this Element
  		* @param width Number/String The new width.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setWidth")
  var setWidth_ICompositeElementLite: js.UndefOr[
    js.Function1[/* width */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
  		* @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setXY")
  var setXY_ICompositeElementLite: js.UndefOr[
    js.Function1[/* pos */ js.UndefOr[Array], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Sets the X position of the element based on page coordinates
  		* @param x Number The X position of the element
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setX")
  var setX_ICompositeElementLite: js.UndefOr[
    js.Function1[/* x */ js.UndefOr[Double], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Sets the Y position of the element based on page coordinates
  		* @param y Number The Y position of the element.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setY")
  var setY_ICompositeElementLite: js.UndefOr[
    js.Function1[/* y */ js.UndefOr[Double], typingsSlinky.senchaTouch.Ext.dom.IElement]
  ] = js.native
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
  		* @param attributes Object The object with the attributes.
  		* @param useSet Boolean false to override the default setAttribute to use expandos.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("set")
  var set_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* attributes */ js.UndefOr[js.Any], 
      /* useSet */ js.UndefOr[Boolean], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
  		* @param className String The CSS class to toggle.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("toggleCls")
  var toggleCls_ICompositeElementLite: js.UndefOr[
    js.Function1[
      /* className */ js.UndefOr[java.lang.String], 
      typingsSlinky.senchaTouch.Ext.dom.IElement
    ]
  ] = js.native
}

object ICompositeElementLite {
  @scala.inline
  def apply(): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElementLite]
  }
  @scala.inline
  implicit class ICompositeElementLiteOps[Self <: ICompositeElementLite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => ICompositeElementLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typingsSlinky.senchaTouch.Ext.dom.IElement
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
    def withAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => ICompositeElementLite
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAddListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendChild(value: /* element */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withAppendTo(value: /* el */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withApplyStyles(value: /* styles */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateChild(
      value: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => typingsSlinky.senchaTouch.Ext.dom.IElement
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
    def withEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => ICompositeElementLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: /* els */ js.UndefOr[js.Any] => ICompositeElementLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* selector */ js.UndefOr[js.Any] => ICompositeElementLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: /* el */ js.UndefOr[js.Any] => Double): Self = {
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
    def withInsertAfter(value: /* el */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withInsertBefore(value: /* el */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withInsertFirst(value: /* element */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withInsertSibling(
      value: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => typingsSlinky.senchaTouch.Ext.dom.IElement
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
    def withItem(value: /* index */ js.UndefOr[Double] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioCls(value: /* className */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withRemoveCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typingsSlinky.senchaTouch.Ext.dom.IElement
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
    def withRemoveElement(value: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => ICompositeElementLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRepaint(value: () => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withReplace(value: /* element */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
      value: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typingsSlinky.senchaTouch.Ext.dom.IElement
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
    def withReplaceElement(
      value: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => ICompositeElementLite
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceElement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutReplaceElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceElement")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceWith(value: /* el */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSelect(
      value: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean]) => ICompositeElementLite
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(
      value: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => typingsSlinky.senchaTouch.Ext.dom.IElement
    ): Self = {
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
    def withSetBottom(value: /* bottom */ js.UndefOr[java.lang.String] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetBox(value: /* box */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetHeight(value: /* height */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetLeft(value: /* left */ js.UndefOr[java.lang.String] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetMaxHeight(value: /* height */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetMaxWidth(value: /* width */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetMinHeight(value: /* height */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetMinWidth(value: /* width */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetRight(value: /* right */ js.UndefOr[java.lang.String] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetSize(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => typingsSlinky.senchaTouch.Ext.dom.IElement
    ): Self = {
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
    def withSetStyle(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typingsSlinky.senchaTouch.Ext.dom.IElement
    ): Self = {
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
    def withSetTop(value: /* top */ js.UndefOr[java.lang.String] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetVisibilityMode(value: /* mode */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetWidth(value: /* width */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetX(value: /* x */ js.UndefOr[Double] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetXY(value: /* pos */ js.UndefOr[Array] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withSetY(value: /* y */ js.UndefOr[Double] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
    def withToggleCls(value: /* className */ js.UndefOr[java.lang.String] => typingsSlinky.senchaTouch.Ext.dom.IElement): Self = {
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
  }
  
}

