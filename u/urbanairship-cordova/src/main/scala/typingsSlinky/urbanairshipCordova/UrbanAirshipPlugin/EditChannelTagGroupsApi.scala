package typingsSlinky.urbanairshipCordova.UrbanAirshipPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the chainable API object returned by editChannelTagGroups().
  */
@js.native
trait EditChannelTagGroupsApi extends js.Object {
  
  /**
    * Used to add the given tags to the given tag group.
    *
    * @param tagGroup The tag group to add tags to.
    * @param tags The tags to add to the group.
    *
    * @returns The chainable API instance.
    */
  def addTags(tagGroup: String, tags: js.Array[String]): EditChannelTagGroupsApi = js.native
  
  /**
    * Used to apply the changes from the chained API call.
    *
    * @param callback The optional function to call on completion.
    */
  @JSName("apply")
  def apply(): Unit = js.native
  @JSName("apply")
  def apply(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Used to remove the given tags from the given tag group.
    *
    * @param tagGroup The tag group to remove tags from.
    * @param tags The tags to remove from the group.
    *
    * @returns The chainable API instance.
    */
  def removeTags(tagGroup: String, tags: js.Array[String]): EditChannelTagGroupsApi = js.native
}
