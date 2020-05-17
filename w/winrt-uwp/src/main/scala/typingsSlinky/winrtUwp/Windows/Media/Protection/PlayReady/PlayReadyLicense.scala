package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties of a PlayReady license. */
@js.native
trait PlayReadyLicense extends js.Object {
  /** Gets the chain depth of the license chain represented by the current PlayReadyLicense class. */
  var chainDepth: Double = js.native
  /** Gets the domain account identifier to which this license is bound. */
  var domainAccountID: String = js.native
  /** Gets the expiration date of the current license. */
  var expirationDate: js.Date = js.native
  /** Gets the amount of time, in seconds, before the current license expires after the media is first played. */
  var expireAfterFirstPlay: Double = js.native
  /** Gets the state of the license. */
  var fullyEvaluated: Boolean = js.native
  /** Gets whether this license is usable for playback. */
  var usableForPlay: Boolean = js.native
  /**
    * Gets the key identifier (KID) of the license at the specified chain depth.
    * @param chainDepth The depth of the license in the chain for which to retrieve the KID. This value is a 0-based index.
    * @return The KID of the license. This return value is sensitive to the underlying platform's endianness. Carefully test your app on all platforms you intend to support to ensure that correct endianness is used on each platform.
    */
  def getKIDAtChainDepth(chainDepth: Double): String = js.native
}

object PlayReadyLicense {
  @scala.inline
  def apply(
    chainDepth: Double,
    domainAccountID: String,
    expirationDate: js.Date,
    expireAfterFirstPlay: Double,
    fullyEvaluated: Boolean,
    getKIDAtChainDepth: Double => String,
    usableForPlay: Boolean
  ): PlayReadyLicense = {
    val __obj = js.Dynamic.literal(chainDepth = chainDepth.asInstanceOf[js.Any], domainAccountID = domainAccountID.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expireAfterFirstPlay = expireAfterFirstPlay.asInstanceOf[js.Any], fullyEvaluated = fullyEvaluated.asInstanceOf[js.Any], getKIDAtChainDepth = js.Any.fromFunction1(getKIDAtChainDepth), usableForPlay = usableForPlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyLicense]
  }
  @scala.inline
  implicit class PlayReadyLicenseOps[Self <: PlayReadyLicense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChainDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainAccountID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainAccountID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpireAfterFirstPlay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireAfterFirstPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullyEvaluated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyEvaluated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKIDAtChainDepth(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKIDAtChainDepth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUsableForPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usableForPlay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

