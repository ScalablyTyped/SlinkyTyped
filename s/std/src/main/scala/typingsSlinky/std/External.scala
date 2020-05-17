package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait External extends js.Object {
  /** @deprecated */
  def AddSearchProvider(): Unit = js.native
  /** @deprecated */
  def IsSearchProviderInstalled(): Unit = js.native
}

object External {
  @scala.inline
  def apply(AddSearchProvider: () => Unit, IsSearchProviderInstalled: () => Unit): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = js.Any.fromFunction0(AddSearchProvider), IsSearchProviderInstalled = js.Any.fromFunction0(IsSearchProviderInstalled))
    __obj.asInstanceOf[External]
  }
  @scala.inline
  implicit class ExternalOps[Self <: org.scalajs.dom.raw.External] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSearchProvider(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSearchProvider")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSearchProviderInstalled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSearchProviderInstalled")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

