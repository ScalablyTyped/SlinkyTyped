package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurface
  extends typingsSlinky.senchaTouch.Ext.IComponent {
  /** [Method] Add a Sprite to the surface  */
  var add: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Method] Empty the surface content without touching the sprites */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Object) */
  var devicePixelRatio: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var dirty: js.UndefOr[Boolean] = js.native
  /** [Method]
  		* @param sprite Ext.draw.sprite.Sprite
  		* @param isWithoutTransform Boolean
  		* @returns Object
  		*/
  var getBBox: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* isWithoutTransform */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns true if the surface is dirty
  		* @returns Boolean 'true' if the surface is dirty
  		*/
  var getDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method]
  		* @param id String The unique identifier of the group.
  		* @returns Ext.draw.Group The group.
  		*/
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IGroup]] = js.native
  /** [Method] Returns the value of groups
  		* @returns Array
  		*/
  var getGroups: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of items
  		* @returns Ext.draw.Group
  		*/
  var getItems: js.UndefOr[js.Function0[IGroup]] = js.native
  /** [Method] Returns the value of region
  		* @returns Array
  		*/
  var getRegion: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Array) */
  var groups: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.draw.Group) */
  var items: js.UndefOr[IGroup] = js.native
  /** [Method] Invoked when a sprite is adding to the surface
  		* @param sprite Ext.draw.sprite.Sprite The sprite to be added.
  		*/
  var onAdd: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  /** [Config Option] (Array) */
  var region: js.UndefOr[Array] = js.native
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
  		* @param sprite Ext.draw.sprite.Sprite
  		* @param destroySprite Boolean
  		*/
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Remove all sprites from the surface optionally destroying the sprites in the process  */
  var removeAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Triggers the re rendering of the canvas  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Force the element to redraw  */
  var repaint: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Reset the matrix of the surface  */
  var resetTransform: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Round the number to align to the pixels on device
  		* @param num Number The number to align.
  		* @returns Number The resultant alignment.
  		*/
  var roundPixel: js.UndefOr[js.Function1[/* num */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of groups
  		* @param groups Array The new value.
  		*/
  var setGroups: js.UndefOr[js.Function1[/* groups */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of items
  		* @param items Ext.draw.Group The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[IGroup], Unit]] = js.native
  /** [Method] Sets the value of region
  		* @param region Array The new value.
  		*/
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Mark the surface to render after another surface is updated
  		* @param surface Ext.draw.Surface The surface to wait for.
  		*/
  var waitFor: js.UndefOr[js.Function1[/* surface */ js.UndefOr[this.type], Unit]] = js.native
}

object ISurface {
  @scala.inline
  def apply(): ISurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISurface]
  }
  @scala.inline
  implicit class ISurfaceOps[Self <: ISurface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
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
    def withDevicePixelRatio(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBBox(value: (/* sprite */ js.UndefOr[ISprite], /* isWithoutTransform */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBackground(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroup(value: /* id */ js.UndefOr[String] => IGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroups(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItems(value: () => IGroup): Self = {
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
    def withGetRegion(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: IGroup): Self = {
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
    def withOnAdd(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
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
    def withRemoveAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFrame(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withRepaint(value: () => Unit): Self = {
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
    def withResetTransform(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResetTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundPixel(value: /* num */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRoundPixel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGroups(value: /* groups */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItems(value: /* items */ js.UndefOr[IGroup] => Unit): Self = {
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
    def withSetRegion(value: /* region */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitFor(value: /* surface */ js.UndefOr[ISurface] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWaitFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.undefined)
        ret
    }
  }
  
}

