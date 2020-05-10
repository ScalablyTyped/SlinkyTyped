package typingsSlinky.vegaTypings.rendererMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.vegaTypings.runtimeMod.Loader_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderModule_ extends js.Object {
  var handler: Handler = js.native
  var headless: js.UndefOr[Renderer] = js.native
  var renderer: Instantiable1[/* loader */ Loader_, Renderer] = js.native
}

object RenderModule_ {
  @scala.inline
  def apply(handler: Handler, renderer: Instantiable1[/* loader */ Loader_, Renderer]): RenderModule_ = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderModule_]
  }
  @scala.inline
  implicit class RenderModule_Ops[Self <: RenderModule_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: Instantiable1[/* loader */ Loader_, Renderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadless(value: Renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(js.undefined)
        ret
    }
  }
  
}

