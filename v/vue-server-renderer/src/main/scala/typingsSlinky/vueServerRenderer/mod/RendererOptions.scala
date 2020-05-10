package typingsSlinky.vueServerRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.vnodeMod.VNode
import typingsSlinky.vue.vnodeMod.VNodeDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererOptions extends js.Object {
  var cache: js.UndefOr[RenderCache] = js.native
  var directives: js.UndefOr[
    StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]]
  ] = js.native
  var inject: js.UndefOr[Boolean] = js.native
  var shouldPrefetch: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.native
  var shouldPreload: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.native
  var template: js.UndefOr[String] = js.native
}

object RendererOptions {
  @scala.inline
  def apply(): RendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererOptions]
  }
  @scala.inline
  implicit class RendererOptionsOps[Self <: RendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: RenderCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectives(value: StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withInject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldPrefetch(value: (/* file */ String, /* type */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrefetch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldPrefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldPreload(value: (/* file */ String, /* type */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPreload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPreload")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
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

