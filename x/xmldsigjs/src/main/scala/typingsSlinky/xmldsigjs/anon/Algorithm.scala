package typingsSlinky.xmldsigjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  var Algorithm: String = js.native
  var Encoding: String = js.native
  var Id: String = js.native
  var MimeType: String = js.native
  var Type: String = js.native
  var URI: String = js.native
}

object Algorithm {
  @scala.inline
  def apply(Algorithm: String, Encoding: String, Id: String, MimeType: String, Type: String, URI: String): Algorithm = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

