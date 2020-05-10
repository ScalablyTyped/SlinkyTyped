package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroup extends IObservable {
  /** [Method] Add sprite to group
  		* @param sprite Ext.draw.sprite.Sprite
  		*/
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  /** [Method] Add a list of sprites to group
  		* @param sprites Array|Ext.draw.sprite.Sprite
  		*/
  var addAll: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Clear the group
  		* @param destroySprite Boolean
  		*/
  var clear: js.UndefOr[js.Function1[/* destroySprite */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Iterate all sprites with specific function
  		* @param fn Function Function to iterate.
  		*/
  var each: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Get the sprite with id or index
  		* @param id String|Number
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], ISprite]] = js.native
  /** [Method] Get the i th sprite of the group
  		* @param index Number
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], ISprite]] = js.native
  /** [Method] Return the minimal bounding box that contains all the sprites bounding boxes in this group
  		* @param isWithTransform Object
  		*/
  var getBBox: js.UndefOr[js.Function1[/* isWithTransform */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of surface
  		* @returns Object
  		*/
  var getSurface: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Hide all sprites in the group
  		* @param o Boolean Whether to re-render the frame.
  		*/
  var hide: js.UndefOr[js.Function1[/* o */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IGroup: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Remote sprite from group
  		* @param sprite Ext.draw.sprite.Sprite
  		* @param destroySprite Boolean
  		*/
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Set attributes to all sprites in the group
  		* @param o Object Sprite attribute options just like in Ext.draw.sprite.Sprite.
  		*/
  var setAttributes: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Set dirty flag for all sprites in the group */
  var setDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of surface
  		* @param surface Object The new value.
  		*/
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Display all sprites in the group
  		* @param o Boolean Whether to re-render the frame.
  		*/
  var show: js.UndefOr[js.Function1[/* o */ js.UndefOr[Boolean], Unit]] = js.native
}

object IGroup {
  @scala.inline
  def apply(): IGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroup]
  }
  @scala.inline
  implicit class IGroupOps[Self <: IGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = {
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
    def withAddAll(value: /* sprites */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withClear(value: /* destroySprite */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withEach(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* id */ js.UndefOr[js.Any] => ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAt(value: /* index */ js.UndefOr[Double] => ISprite): Self = {
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
    def withGetBBox(value: /* isWithTransform */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSurface(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: /* o */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = {
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
    def withSetAttributes(value: /* o */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSurface(value: /* surface */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSurface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* o */ js.UndefOr[Boolean] => Unit): Self = {
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
  }
  
}

