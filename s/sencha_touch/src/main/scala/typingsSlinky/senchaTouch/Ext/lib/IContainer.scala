package typingsSlinky.senchaTouch.Ext.lib

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.scroll.IView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer
  extends typingsSlinky.senchaTouch.Ext.IComponent {
  /** [Config Option] (Object/String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.native
  /** [Method] Adds one or more Components to this Container
  		* @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
  		* @returns Ext.Component The last item added to the Container from the newItems array.
  		*/
  var add: js.UndefOr[
    js.Function1[/* newItems */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.IComponent]
  ] = js.native
  /** [Method] Adds an array of Components to this Container
  		* @param items Array The array of items to add to this container.
  		* @returns Array The array of items after they have been added.
  		*/
  var addAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Animates to the supplied activeItem with a specified animation
  		* @param activeItem Object/Number The item or item index to make active.
  		* @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
  		*/
  var animateActiveItem: js.UndefOr[
    js.Function2[/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
  		* @returns Object
  		*/
  var applyMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Object/Boolean) */
  var cardSwitchAnimation: js.UndefOr[js.Any] = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector
  		* @param selector String An Ext.ComponentQuery selector.
  		* @returns Ext.Component
  		*/
  var child: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[String], typingsSlinky.senchaTouch.Ext.IComponent]
  ] = js.native
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String An Ext.ComponentQuery selector.
  		* @returns Ext.Component
  		*/
  var down: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[String], typingsSlinky.senchaTouch.Ext.IComponent]
  ] = js.native
  /** [Method] Returns the value of activeItem
  		* @returns Object/String/Number
  		*/
  var getActiveItem: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the Component for a given index in the Container s items
  		* @param index Number The index of the Component to return.
  		* @returns Ext.Component The item at the specified index, if found.
  		*/
  var getAt: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typingsSlinky.senchaTouch.Ext.IComponent]
  ] = js.native
  /** [Method] Returns the value of autoDestroy
  		* @returns Boolean
  		*/
  var getAutoDestroy: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Examines this container s items property and gets a direct child component of this container
  		* @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
  		* @returns Ext.Component The component (if found).
  		*/
  var getComponent: js.UndefOr[
    js.Function1[/* component */ js.UndefOr[js.Any], typingsSlinky.senchaTouch.Ext.IComponent]
  ] = js.native
  /** [Method] Returns the value of control
  		* @returns Object
  		*/
  var getControl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of defaultType
  		* @returns String
  		*/
  var getDefaultType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
  		* @param component String/Number The id or index of the component to find.
  		* @returns Ext.Component/Boolean The docked component, if found.
  		*/
  var getDockedComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns all the Ext Component docked items in this container
  		* @returns Array The docked items of this container.
  		*/
  var getDockedItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of hideOnMaskTap
  		* @returns Boolean
  		*/
  var getHideOnMaskTap: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns all inner items of this container
  		* @returns Array The inner items of this container.
  		*/
  var getInnerItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of items
  		* @returns Array/Object
  		*/
  var getItems: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of masked
  		* @returns Boolean/Object/Ext.Mask/Ext.LoadMask
  		*/
  var getMasked: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of modal
  		* @returns Boolean
  		*/
  var getModal: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
  		* @returns Ext.scroll.View The scroll view.
  		*/
  var getScrollable: js.UndefOr[js.Function0[IView]] = js.native
  /** [Method] Hides this Component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("hide")
  var hide_IContainer: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.IComponent]] = js.native
  /** [Method] Adds a child Component at the given index
  		* @param index Number The index to insert the Component at.
  		* @param item Object The Component to insert.
  		*/
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Array/Object) */
  var items: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object/String) */
  var layout: js.UndefOr[js.Any] = js.native
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
  		* @param mask Object
  		*/
  var mask: js.UndefOr[js.Function1[/* mask */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean/Object/Ext.Mask/Ext.LoadMask) */
  var masked: js.UndefOr[js.Any] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector.
  		* @returns Array Ext.Component's which matched the selector.
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Array]] = js.native
  /** [Method] Removes an item from this Container optionally destroying it
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  var remove: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* destroy */ js.UndefOr[Boolean], 
      typingsSlinky.senchaTouch.Ext.IComponent
    ]
  ] = js.native
  /** [Method] Removes all items currently in the Container optionally destroying them all
  		* @param destroy Boolean If true, destroys each removed Component.
  		* @param everything Boolean If true, completely remove all items including docked / centered and floating items.
  		* @returns Ext.Component this
  		*/
  var removeAll: js.UndefOr[
    js.Function2[
      /* destroy */ js.UndefOr[Boolean], 
      /* everything */ js.UndefOr[Boolean], 
      typingsSlinky.senchaTouch.Ext.IComponent
    ]
  ] = js.native
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Removes a docked item from this Container
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  var removeDocked: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* destroy */ js.UndefOr[Boolean], 
      typingsSlinky.senchaTouch.Ext.IComponent
    ]
  ] = js.native
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  var removeInnerAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  /** [Config Option] (Boolean/String/Object) */
  var scrollable: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of activeItem
  		* @param activeItem Object/String/Number The new value.
  		*/
  var setActiveItem: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of autoDestroy
  		* @param autoDestroy Boolean The new value.
  		*/
  var setAutoDestroy: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of defaultType
  		* @param defaultType String The new value.
  		*/
  var setDefaultType: js.UndefOr[js.Function1[/* defaultType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hideOnMaskTap
  		* @param hideOnMaskTap Boolean The new value.
  		*/
  var setHideOnMaskTap: js.UndefOr[js.Function1[/* hideOnMaskTap */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of items
  		* @param items Array/Object The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of layout
  		* @param layout Object/String The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of masked
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
  		*/
  var setMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of modal
  		* @param modal Boolean The new value.
  		*/
  var setModal: js.UndefOr[js.Function1[/* modal */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of scrollable
  		* @param scrollable Boolean/String/Object The new value.
  		* @returns Ext.scroll.View The scroll view.
  		*/
  @JSName("setScrollable")
  var setScrollable_IContainer: js.UndefOr[js.Function1[/* scrollable */ js.UndefOr[js.Any], IView]] = js.native
  /** [Method] Shows this component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("show")
  var show_IContainer: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.IComponent]] = js.native
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.native
}

object IContainer {
  @scala.inline
  def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  @scala.inline
  implicit class IContainerOps[Self <: IContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAdd(value: /* newItems */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddAll(value: /* items */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateActiveItem(value: (/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateActiveItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAnimateActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyMasked(value: /* masked */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMasked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyMasked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMasked")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withCardSwitchAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSwitchAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardSwitchAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSwitchAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withChild(value: /* selector */ js.UndefOr[String] => typingsSlinky.senchaTouch.Ext.IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDown(value: /* selector */ js.UndefOr[String] => typingsSlinky.senchaTouch.Ext.IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveItem(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAt(value: /* index */ js.UndefOr[Double] => typingsSlinky.senchaTouch.Ext.IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoDestroy(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoDestroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetComponent(value: /* component */ js.UndefOr[js.Any] => typingsSlinky.senchaTouch.Ext.IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetControl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaults(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDockedComponent(value: /* component */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDockedComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDockedItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDockedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDockedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHideOnMaskTap(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHideOnMaskTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHideOnMaskTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHideOnMaskTap")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInnerItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInnerItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItems(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMasked(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMasked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMasked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMasked")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModal")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollable(value: () => IView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => typingsSlinky.senchaTouch.Ext.IComponent): Self = {
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
    def withInsert(value: (/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: /* mask */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMasked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masked")(js.undefined)
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
    def withRemove(
      value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => typingsSlinky.senchaTouch.Ext.IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(
      value: (/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean]) => typingsSlinky.senchaTouch.Ext.IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAt(value: /* index */ js.UndefOr[Double] => IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDocked(
      value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => typingsSlinky.senchaTouch.Ext.IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDocked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDocked")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveInnerAt(value: /* index */ js.UndefOr[Double] => IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInnerAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveInnerAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInnerAt")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveItem(value: /* activeItem */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoDestroy(value: /* autoDestroy */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoDestroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetControl(value: /* control */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultType(value: /* defaultType */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHideOnMaskTap(value: /* hideOnMaskTap */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHideOnMaskTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHideOnMaskTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHideOnMaskTap")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItems(value: /* items */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMasked(value: /* masked */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMasked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMasked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMasked")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModal(value: /* modal */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModal")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollable(value: /* scrollable */ js.UndefOr[js.Any] => IView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => typingsSlinky.senchaTouch.Ext.IComponent): Self = {
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
  }
  
}

