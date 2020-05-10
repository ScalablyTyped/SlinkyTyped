package typingsSlinky.senchaTouch.Ext.draw.sprite

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAttributeDefinition extends IBase {
  /** [Config Option] (Object) */
  var aliases: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var animationProcessors: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dirty: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of aliases
  		* @returns Object
  		*/
  var getAliases: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of animationProcessors
  		* @returns Object
  		*/
  var getAnimationProcessors: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of processors
  		* @returns Object
  		*/
  var getProcessors: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of updaters
  		* @returns Object
  		*/
  var getUpdaters: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Normalizes the changes given via their processors before they are applied as attributes
  		* @param changes Object The changes given.
  		* @returns Object The normalized values.
  		*/
  var normalize: js.UndefOr[js.Function1[/* changes */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Object) */
  var processors: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of aliases
  		* @param aliases Object The new value.
  		*/
  var setAliases: js.UndefOr[js.Function1[/* aliases */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of animationProcessors
  		* @param animationProcessors Object The new value.
  		*/
  var setAnimationProcessors: js.UndefOr[js.Function1[/* animationProcessors */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of processors
  		* @param processors Object The new value.
  		*/
  var setProcessors: js.UndefOr[js.Function1[/* processors */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of updaters
  		* @param updaters Object The new value.
  		*/
  var setUpdaters: js.UndefOr[js.Function1[/* updaters */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var updaters: js.UndefOr[js.Any] = js.native
}

object IAttributeDefinition {
  @scala.inline
  def apply(): IAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttributeDefinition]
  }
  @scala.inline
  implicit class IAttributeDefinitionOps[Self <: IAttributeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationProcessors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationProcessors")(js.undefined)
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
    def withDirty(value: js.Any): Self = {
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
    def withGetAliases(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAliases")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimationProcessors(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimationProcessors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnimationProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimationProcessors")(js.undefined)
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
    def withGetProcessors(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProcessors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProcessors")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUpdaters(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdaters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUpdaters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdaters")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: /* changes */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAliases(value: /* aliases */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAliases")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAnimationProcessors(value: /* animationProcessors */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimationProcessors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAnimationProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimationProcessors")(js.undefined)
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
    def withSetProcessors(value: /* processors */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProcessors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProcessors")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUpdaters(value: /* updaters */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUpdaters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUpdaters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUpdaters")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdaters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updaters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdaters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updaters")(js.undefined)
        ret
    }
  }
  
}

