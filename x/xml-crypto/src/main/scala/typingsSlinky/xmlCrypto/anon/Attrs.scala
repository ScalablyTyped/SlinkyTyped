package typingsSlinky.xmlCrypto.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs extends js.Object {
  var attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.native
  var location: js.UndefOr[Action] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object Attrs {
  @scala.inline
  def apply(): Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attrs]
  }
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withExistingPrefixes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistingPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

