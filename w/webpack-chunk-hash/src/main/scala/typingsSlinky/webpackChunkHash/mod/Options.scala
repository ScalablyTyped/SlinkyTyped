package typingsSlinky.webpackChunkHash.mod

import typingsSlinky.webpackChunkHash.webpackChunkHashStrings.base64
import typingsSlinky.webpackChunkHash.webpackChunkHashStrings.hex
import typingsSlinky.webpackChunkHash.webpackChunkHashStrings.latin1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    	 * @default null
    	 * @description A callback to add more content to the resulting hash
    	 */
  var additionalHashContent: js.UndefOr[js.Function1[/* chunk */ js.Any, String]] = js.native
  /**
    	 * @default 'md5'
    	 * @description The hash algorithm to use
    	 * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    	 */
  var algorithm: js.UndefOr[String] = js.native
  /**
    	 * @default 'hex'
    	 * @description The digest enconding to use
    	 * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    	 */
  var digest: js.UndefOr[hex | latin1 | base64] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalHashContent(value: /* chunk */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalHashContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdditionalHashContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalHashContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withDigest(value: hex | latin1 | base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.undefined)
        ret
    }
  }
  
}

