package typingsSlinky.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialStatusCode extends js.Object

/** Specifies a status or error code. */
@JSGlobal("SP.Social.SocialStatusCode")
@js.native
object SocialStatusCode extends js.Object {
  @js.native
  sealed trait OK extends SocialStatusCode
  
  /** This value specifies that access was denied to the current user. */
  @js.native
  sealed trait accessDenied extends SocialStatusCode
  
  /** This value specifies that the operation failed because there was an error handling an attachment. */
  @js.native
  sealed trait attachmentError extends SocialStatusCode
  
  /** This value specifies that there was an error reading the cache. */
  @js.native
  sealed trait cacheReadError extends SocialStatusCode
  
  /** This value specifies that there was an error updating the cache. */
  @js.native
  sealed trait cacheUpdateError extends SocialStatusCode
  
  @js.native
  sealed trait cannotCreatePersonalSite extends SocialStatusCode
  
  @js.native
  sealed trait failedToCreatePersonalSite extends SocialStatusCode
  
  /** This value specifies that the operation failed because a required server feature was disabled by administrative action. */
  @js.native
  sealed trait featureDisabled extends SocialStatusCode
  
  @js.native
  sealed trait internalError extends SocialStatusCode
  
  /** This value specifies that an invalid operation was attempted. */
  @js.native
  sealed trait invalidOperation extends SocialStatusCode
  
  /** This value specifies that an invalid request was encountered. */
  @js.native
  sealed trait invalidRequest extends SocialStatusCode
  
  @js.native
  sealed trait itemNotFound extends SocialStatusCode
  
  /** This value specifies that the item was not changed by the operation. */
  @js.native
  sealed trait itemNotModified extends SocialStatusCode
  
  /** This value specifies that a server limit was reached. */
  @js.native
  sealed trait limitReached extends SocialStatusCode
  
  @js.native
  sealed trait notAuthorizedToCreatePersonalSite extends SocialStatusCode
  
  /** This value specifies that the operation completed with recoverable errors and that the returned data is incomplete. */
  @js.native
  sealed trait partialData extends SocialStatusCode
  
  @js.native
  sealed trait personalSiteNotFound extends SocialStatusCode
  
  /* 0 */ val OK: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.OK with Double = js.native
  /* 2 */ val accessDenied: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.accessDenied with Double = js.native
  /* 14 */ val attachmentError: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.attachmentError with Double = js.native
  /* 7 */ val cacheReadError: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.cacheReadError with Double = js.native
  /* 8 */ val cacheUpdateError: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.cacheUpdateError with Double = js.native
  /* 12 */ val cannotCreatePersonalSite: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.cannotCreatePersonalSite with Double = js.native
  /* 10 */ val failedToCreatePersonalSite: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.failedToCreatePersonalSite with Double = js.native
  /* 16 */ val featureDisabled: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.featureDisabled with Double = js.native
  /* 6 */ val internalError: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.internalError with Double = js.native
  /* 4 */ val invalidOperation: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.invalidOperation with Double = js.native
  /* 1 */ val invalidRequest: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.invalidRequest with Double = js.native
  /* 3 */ val itemNotFound: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.itemNotFound with Double = js.native
  /* 5 */ val itemNotModified: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.itemNotModified with Double = js.native
  /* 13 */ val limitReached: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.limitReached with Double = js.native
  /* 11 */ val notAuthorizedToCreatePersonalSite: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.notAuthorizedToCreatePersonalSite with Double = js.native
  /* 15 */ val partialData: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.partialData with Double = js.native
  /* 9 */ val personalSiteNotFound: typingsSlinky.sharepoint.SP.Social.SocialStatusCode.personalSiteNotFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialStatusCode with Double] = js.native
}

