package typingsSlinky.webpackServe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  /** Function to call to add koa-static */
  def content(): Unit = js.native
  /** Function to call to add the webpack-dev-middleware */
  def webpack(): Unit = js.native
}

object Middleware {
  @scala.inline
  def apply(content: () => Unit, webpack: () => Unit): Middleware = {
    val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), webpack = js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[Middleware]
  }
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWebpack(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

