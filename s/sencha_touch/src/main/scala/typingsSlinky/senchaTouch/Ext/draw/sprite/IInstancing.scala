package typingsSlinky.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInstancing extends ISprite {
  /** [Method] Creates a new sprite instance
  		* @param config Object The configuration of the instance.
  		* @param data Object
  		* @param bypassNormalization Boolean 'true' to bypass attribute normalization.
  		* @param avoidCopy Boolean 'true' to avoid copying.
  		* @returns Object The attributes of the instance.
  		*/
  var createInstance: js.UndefOr[
    js.Function4[
      /* config */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      /* avoidCopy */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Returns the bounding box for the instance at the given index
  		* @param index Number The index of the instance.
  		* @param isWithoutTransform Boolean 'true' to not apply sprite transforms to the bounding box.
  		* @returns Object The bounding box for the instance.
  		*/
  var getBBoxFor: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* isWithoutTransform */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Not supported
  		* @returns null
  		*/
  @JSName("getBBox")
  var getBBox_IInstancing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of template
  		* @returns Object
  		*/
  var getTemplate: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @param region Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IInstancing: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Sets the attributes for the instance at the given index
  		* @param index Number the index of the instance
  		* @param changes Object the attributes to change
  		* @param bypassNormalization Boolean 'true' to avoid attribute normalization
  		*/
  var setAttributesFor: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of template
  		* @param template Object The new value.
  		*/
  var setTemplate: js.UndefOr[js.Function1[/* template */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var template: js.UndefOr[js.Any] = js.native
}

object IInstancing {
  @scala.inline
  def apply(): IInstancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInstancing]
  }
  @scala.inline
  implicit class IInstancingOps[Self <: IInstancing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateInstance(
      value: (/* config */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCreateInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBBox(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBBoxFor(value: (/* index */ js.UndefOr[Double], /* isWithoutTransform */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBoxFor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetBBoxFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBoxFor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTemplate(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributesFor(
      value: (/* index */ js.UndefOr[Double], /* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributesFor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetAttributesFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributesFor")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTemplate(value: /* template */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

