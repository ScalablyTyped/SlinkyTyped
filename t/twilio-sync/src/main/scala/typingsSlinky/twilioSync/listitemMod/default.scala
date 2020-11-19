package typingsSlinky.twilioSync.listitemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  * @classdesc Represents an individual element in a Sync List.
  * @alias ListItem
  * @property {Number} index The index, within the containing List, of this item. This index is stable;
  * even if lower-indexed Items are removed, this index will remain as is.
  * @property {Object} value The contents of the item.
  * @property {Date} dateUpdated Date when the List Item was last updated.
  */
@JSImport("twilio-sync/lib/listitem", JSImport.Default)
@js.native
class default protected () extends ListItem {
  /**
    * @private
    * @constructor
    * @param {Object} data Item descriptor
    * @param {Number} data.index Item identifier
    * @param {String} data.uri Item URI
    * @param {Object} data.value Item data
    */
  def this(data: ListItemDescriptor) = this()
}
