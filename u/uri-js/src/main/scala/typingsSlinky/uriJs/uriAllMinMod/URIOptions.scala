package typingsSlinky.uriJs.uriAllMinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URIOptions extends js.Object {
  var absolutePath: js.UndefOr[Boolean] = js.native
  var domainHost: js.UndefOr[Boolean] = js.native
  var iri: js.UndefOr[Boolean] = js.native
  var reference: js.UndefOr[String] = js.native
  var scheme: js.UndefOr[String] = js.native
  var tolerant: js.UndefOr[Boolean] = js.native
  var unicodeSupport: js.UndefOr[Boolean] = js.native
}

object URIOptions {
  @scala.inline
  def apply(): URIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URIOptions]
  }
  @scala.inline
  implicit class URIOptionsOps[Self <: URIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainHost")(js.undefined)
        ret
    }
    @scala.inline
    def withIri(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iri")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerant")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeSupport")(js.undefined)
        ret
    }
  }
  
}

