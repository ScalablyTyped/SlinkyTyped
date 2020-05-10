package typingsSlinky.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPath extends ISprite {
  /** [Config Option] (String) */
  var path: js.UndefOr[String] = js.native
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IPath: js.UndefOr[js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Update the path
  		* @param path Ext.draw.Path An empty path to draw on using path API.
  		* @param attr Object The attribute object. Note: DO NOT use the sprite.attr instead of this if you want to work with instancing.
  		*/
  var updatePath: js.UndefOr[
    js.Function2[/* path */ js.UndefOr[this.type], /* attr */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
  		* @param transform Object
  		*/
  @JSName("updateTransformedBBox")
  var updateTransformedBBox_IPath: js.UndefOr[js.Function1[/* transform */ js.UndefOr[js.Any], Unit]] = js.native
}

object IPath {
  @scala.inline
  def apply(): IPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPath]
  }
  @scala.inline
  implicit class IPathOps[Self <: IPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePath(value: (/* path */ js.UndefOr[IPath], /* attr */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTransformedBBox(value: /* transform */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTransformedBBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateTransformedBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTransformedBBox")(js.undefined)
        ret
    }
  }
  
}

