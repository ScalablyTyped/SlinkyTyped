package typingsSlinky.senchaTouch.Ext.draw.modifier

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModifier extends IBase {
  /** [Method] Returns the value of next
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getNext: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns the value of previous
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getPrevious: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns the value of sprite
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var getSprite: js.UndefOr[js.Function0[ISprite]] = js.native
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var next: js.UndefOr[IModifier] = js.native
  /** [Method] Invoked when changes need to be popped up to the top
  		* @param attributes Object The source attributes.
  		* @param changes Object The changes to be popped up.
  		*/
  var popUp: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Validate attribute set before use
  		* @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
  		*/
  var prepareAttributes: js.UndefOr[js.Function1[/* attr */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var previous: js.UndefOr[IModifier] = js.native
  /** [Method] Invoked when changes need to be pushed down to the sprite
  		* @param attr Object The source attributes.
  		* @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
  		* @returns Mixed
  		*/
  var pushDown: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of next
  		* @param next Ext.draw.modifier.Modifier The new value.
  		*/
  var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.native
  /** [Method] Sets the value of previous
  		* @param previous Ext.draw.modifier.Modifier The new value.
  		*/
  var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.native
  /** [Method] Sets the value of sprite
  		* @param sprite Ext.draw.sprite.Sprite The new value.
  		*/
  var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  /** [Config Option] (Ext.draw.sprite.Sprite) */
  var sprite: js.UndefOr[ISprite] = js.native
}

object IModifier {
  @scala.inline
  def apply(): IModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModifier]
  }
  @scala.inline
  implicit class IModifierOps[Self <: IModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNext(value: () => IModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPrevious(value: () => IModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSprite(value: () => ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: IModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPopUp(value: (/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPopUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareAttributes(value: /* attr */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepareAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious(value: IModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.undefined)
        ret
    }
    @scala.inline
    def withPushDown(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPushDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushDown")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNext(value: /* next */ js.UndefOr[IModifier] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNext")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPrevious(value: /* previous */ js.UndefOr[IModifier] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrevious")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSprite(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSprite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withSprite(value: ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(js.undefined)
        ret
    }
  }
  
}

