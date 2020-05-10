package typingsSlinky.webpackSubresourceIntegrity.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Default value: true
    * When this value is falsy, the plugin doesn't run and no integrity values are calculated. It is recommended to disable the plugin in development mode.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * An array of strings, each specifying the name of a hash function to be used for calculating integrity hash values. For example, ['sha256', 'sha512'].
    */
  var hashFuncNames: js.Array[String] = js.native
}

object Options {
  @scala.inline
  def apply(hashFuncNames: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(hashFuncNames = hashFuncNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashFuncNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFuncNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

