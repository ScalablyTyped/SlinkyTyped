package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.SP.WebParts.LimitedWebPartManager
import typingsSlinky.sharepoint.SP.WebParts.PersonalizationScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file in a SharePoint Web site that can be a Web Part Page, an item in a document library, or a file in a folder. */
@js.native
trait File extends ClientObject {
  
  /** Approves the file submitted for content approval with the specified comment.  */
  def approve(comment: String): Unit = js.native
  
  def checkIn(comment: String, checkInType: CheckinType): Unit = js.native
  
  def checkOut(): Unit = js.native
  
  def copyTo(strNewUrl: String, bOverWrite: Boolean): Unit = js.native
  
  def deleteObject(): Unit = js.native
  
  /** Denies the file submitted for content approval. */
  def deny(comment: String): Unit = js.native
  
  def getLimitedWebPartManager(scope: PersonalizationScope): LimitedWebPartManager = js.native
  
  def get_author(): User = js.native
  
  /** Returns the comment that was specified when the document was checked into the document library. */
  def get_checkInComment(): String = js.native
  
  /** The type of checkout that exists on the document. */
  def get_checkOutType(): CheckOutType = js.native
  
  /** Returns the user who has checked out the file. */
  def get_checkedOutByUser(): User = js.native
  
  def get_contentTag(): String = js.native
  
  /** Gets the customization(ghost) status of the SPFile. */
  def get_customizedPageStatus(): CustomizedPageStatus = js.native
  
  /** Gets the ETag of the file  */
  def get_eTag(): String = js.native
  
  /** Specifies whether the file exists  */
  def get_exists(): Boolean = js.native
  
  def get_length(): Double = js.native
  
  def get_level(): FileLevel = js.native
  
  /** Specifies the SPListItem corresponding to this file if this file belongs to a doclib. Values for all fields are returned also. */
  def get_listItemAllFields[T](): ListItem[T] = js.native
  
  /** Returns the user that owns the current lock on the file. MUST return null if there is no lock. */
  def get_lockedByUser(): User = js.native
  
  /** Specifies the major version of the file. */
  def get_majorVersion(): Double = js.native
  
  /** Specifies the minor version of the file. */
  def get_minorVersion(): Double = js.native
  
  def get_modifiedBy(): User = js.native
  
  def get_name(): String = js.native
  
  def get_serverRelativeUrl(): String = js.native
  
  /** Specifies when the file was created. */
  def get_timeCreated(): js.Date = js.native
  
  /** Specifies when the file was created. */
  def get_timeLastModified(): js.Date = js.native
  
  def get_title(): String = js.native
  
  /** Specifies the implementation-specific version identifier of the file. */
  def get_uIVersion(): Double = js.native
  
  /** Specifies the implementation-specific version identifier of the file. */
  def get_uIVersionLabel(): String = js.native
  
  /** Returns a collection of file version objects that represent the versions of the file. */
  def get_versions(): FileVersionCollection = js.native
  
  def moveTo(newUrl: String, flags: MoveOperations): Unit = js.native
  
  def publish(comment: String): Unit = js.native
  
  /** Moves the file to the recycle bin. MUST return the identifier of the new Recycle Bin item */
  def recycle(): GuidResult = js.native
  
  def saveBinary(parameters: FileSaveBinaryInformation): Unit = js.native
  
  /** Removes the file from content approval with the specified comment. */
  def unPublish(comment: String): Unit = js.native
  
  /** Reverts an existing online or offline checkout for the file. */
  def undoCheckOut(): Unit = js.native
}
