package typingsSlinky.senchaTouch.Ext.draw.engine

import typingsSlinky.senchaTouch.Ext.draw.ISurface
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISvg extends ISurface {
  /** [Method] Clears the current transformation state on the surface  */
  var clearTransform: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Creates a DOM element under the SVG namespace of the given type
  		* @param type String The type of the SVG DOM element.
  		* @returns * The created element.
  		*/
  var createSvgNode: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], _]] = js.native
  /** [Method] Destroys the Canvas element and prepares it for Garbage Collection
  		* @param path Object
  		* @param matrix Object
  		* @param band Object
  		*/
  @JSName("destroy")
  var destroy_ISvg: js.UndefOr[
    js.Function3[
      /* path */ js.UndefOr[js.Any], 
      /* matrix */ js.UndefOr[js.Any], 
      /* band */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of highPrecision
  		* @returns Boolean
  		*/
  var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var highPrecision: js.UndefOr[Boolean] = js.native
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
  		* @param sprite Object
  		* @param destroySprite Object
  		*/
  @JSName("remove")
  var remove_ISvg: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Renders a single sprite into the surface
  		* @param sprite Ext.draw.sprite.Sprite The Sprite to be rendered.
  		* @returns Boolean returns false to stop the rendering to continue.
  		*/
  var renderSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Boolean]] = js.native
  /** [Method] Sets the value of highPrecision
  		* @param highPrecision Boolean The new value.
  		*/
  var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.native
}

object ISvg {
  @scala.inline
  def apply(): ISvg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISvg]
  }
  @scala.inline
  implicit class ISvgOps[Self <: ISvg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearTransform(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSvgNode(value: /* type */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSvgNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateSvgNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSvgNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(
      value: (/* path */ js.UndefOr[js.Any], /* matrix */ js.UndefOr[js.Any], /* band */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHighPrecision(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighPrecision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withHighPrecision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any]) => Unit): Self = {
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
    def withRenderSprite(value: /* sprite */ js.UndefOr[ISprite] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSprite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighPrecision")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighPrecision")(js.undefined)
        ret
    }
  }
  
}

