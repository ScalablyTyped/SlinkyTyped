package typingsSlinky.webicon.dynamicUrlDeclarationMod

import typingsSlinky.webicon.staticUrlDeclarationMod.StaticUrlDeclaration
import typingsSlinky.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicUrlDeclaration[T] extends UrlDeclarationBase {
  /**
    * Either the actual url or a function for generating the url.
    */
  @JSName("url")
  var url_DynamicUrlDeclaration: js.UndefOr[String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])] = js.native
}

object DynamicUrlDeclaration {
  @scala.inline
  def apply[T](): DynamicUrlDeclaration[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicUrlDeclaration[T]]
  }
  @scala.inline
  implicit class DynamicUrlDeclarationOps[Self[t] <: DynamicUrlDeclaration[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUrlFunction1(value: /* args */ T => String | StaticUrlDeclaration): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrl(value: String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

