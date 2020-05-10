package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSNavigatorDoNotTrack extends js.Object {
  def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean = js.native
  def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean = js.native
  def removeSiteSpecificTrackingException(args: ExceptionInformation): Unit = js.native
  def removeWebWideTrackingException(args: ExceptionInformation): Unit = js.native
  def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): Unit = js.native
  def storeWebWideTrackingException(args: StoreExceptionsInformation): Unit = js.native
}

object MSNavigatorDoNotTrack {
  @scala.inline
  def apply(
    confirmSiteSpecificTrackingException: ConfirmSiteSpecificExceptionsInformation => scala.Boolean,
    confirmWebWideTrackingException: ExceptionInformation => scala.Boolean,
    removeSiteSpecificTrackingException: ExceptionInformation => Unit,
    removeWebWideTrackingException: ExceptionInformation => Unit,
    storeSiteSpecificTrackingException: StoreSiteSpecificExceptionsInformation => Unit,
    storeWebWideTrackingException: StoreExceptionsInformation => Unit
  ): MSNavigatorDoNotTrack = {
    val __obj = js.Dynamic.literal(confirmSiteSpecificTrackingException = js.Any.fromFunction1(confirmSiteSpecificTrackingException), confirmWebWideTrackingException = js.Any.fromFunction1(confirmWebWideTrackingException), removeSiteSpecificTrackingException = js.Any.fromFunction1(removeSiteSpecificTrackingException), removeWebWideTrackingException = js.Any.fromFunction1(removeWebWideTrackingException), storeSiteSpecificTrackingException = js.Any.fromFunction1(storeSiteSpecificTrackingException), storeWebWideTrackingException = js.Any.fromFunction1(storeWebWideTrackingException))
    __obj.asInstanceOf[MSNavigatorDoNotTrack]
  }
  @scala.inline
  implicit class MSNavigatorDoNotTrackOps[Self <: MSNavigatorDoNotTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmSiteSpecificTrackingException(value: ConfirmSiteSpecificExceptionsInformation => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmSiteSpecificTrackingException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfirmWebWideTrackingException(value: ExceptionInformation => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmWebWideTrackingException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSiteSpecificTrackingException(value: ExceptionInformation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSiteSpecificTrackingException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveWebWideTrackingException(value: ExceptionInformation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWebWideTrackingException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStoreSiteSpecificTrackingException(value: StoreSiteSpecificExceptionsInformation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeSiteSpecificTrackingException")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStoreWebWideTrackingException(value: StoreExceptionsInformation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeWebWideTrackingException")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

