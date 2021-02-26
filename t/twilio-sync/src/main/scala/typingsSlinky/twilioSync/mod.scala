package typingsSlinky.twilioSync

import typingsSlinky.twilioSync.listitemMod.ListItem
import typingsSlinky.twilioSync.listitemMod.ListItemDescriptor
import typingsSlinky.twilioSync.mapitemMod.MapItem
import typingsSlinky.twilioSync.mapitemMod.MapItemDescriptor
import typingsSlinky.twilioSync.syncdocumentMod.SyncDocumentImpl
import typingsSlinky.twilioSync.synclistMod.SyncListImpl
import typingsSlinky.twilioSync.syncmapMod.SyncMapImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @class Client
    * @classdesc
    * Client for the Twilio Sync service.
    * @constructor
    * @param {String} token - Twilio access token.
    * @param {Client#ClientOptions} [options] - Options to customize the Client.
    * @example
    * // Using NPM
    * var SyncClient = require('twilio-sync');
    * var syncClient = new SyncClient(token, { logLevel: 'debug' });
    *
    * // Using CDN
    * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
    *
    * @property {Client#ConnectionState} connectionState - Contains current service connection state.
    * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
    */
  @JSImport("twilio-sync", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.twilioSync.clientMod.SyncClient {
    def this(fpaToken: String) = this()
    def this(fpaToken: String, options: js.Any) = this()
  }
  
  /**
    * @class Client
    * @classdesc
    * Client for the Twilio Sync service.
    * @constructor
    * @param {String} token - Twilio access token.
    * @param {Client#ClientOptions} [options] - Options to customize the Client.
    * @example
    * // Using NPM
    * var SyncClient = require('twilio-sync');
    * var syncClient = new SyncClient(token, { logLevel: 'debug' });
    *
    * // Using CDN
    * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
    *
    * @property {Client#ConnectionState} connectionState - Contains current service connection state.
    * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
    */
  @JSImport("twilio-sync", "SyncClient")
  @js.native
  class SyncClient protected ()
    extends typingsSlinky.twilioSync.clientMod.SyncClient {
    def this(fpaToken: String) = this()
    def this(fpaToken: String, options: js.Any) = this()
  }
  
  /**
    * @class
    * @alias Document
    * @classdesc Represents a Sync Document, the contents of which is a single JSON object.
    * Use the {@link Client#document} method to obtain a reference to a Sync Document.
    * @property {String} sid The immutable identifier of this document, assigned by the system.
    * @property {String} [uniqueName=null] An optional immutable identifier that may be assigned by the programmer
    * to this document during creation. Globally unique among other Documents.
    * @property {Date} dateUpdated Date when the Document was last updated.
    * @property {Object} value The contents of this document.
    *
    * @fires Document#removed
    * @fires Document#updated
    */
  @JSImport("twilio-sync", "SyncDocument")
  @js.native
  class SyncDocument protected ()
    extends typingsSlinky.twilioSync.syncdocumentMod.SyncDocument {
    def this(syncDocumentImpl: SyncDocumentImpl) = this()
  }
  
  /**
    * @class
    * @alias List
    * @classdesc Represents a Sync List, which stores an ordered list of values.
    * Use the {@link Client#list} method to obtain a reference to a Sync List.
    * @property {String} sid - List unique id, immutable identifier assigned by the system.
    * @property {String} [uniqueName=null] - List unique name, immutable identifier that can be assigned to list during creation.
    * @property {Date} dateUpdated Date when the List was last updated.
    *
    * @fires List#removed
    * @fires List#itemAdded
    * @fires List#itemRemoved
    * @fires List#itemUpdated
    */
  @JSImport("twilio-sync", "SyncList")
  @js.native
  class SyncList protected ()
    extends typingsSlinky.twilioSync.synclistMod.SyncList {
    def this(syncListImpl: SyncListImpl) = this()
  }
  
  /**
    * @class
    * @classdesc Represents an individual element in a Sync List.
    * @alias ListItem
    * @property {Number} index The index, within the containing List, of this item. This index is stable;
    * even if lower-indexed Items are removed, this index will remain as is.
    * @property {Object} value The contents of the item.
    * @property {Date} dateUpdated Date when the List Item was last updated.
    */
  @JSImport("twilio-sync", "SyncListItem")
  @js.native
  class SyncListItem protected () extends ListItem {
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
  
  /**
    * @class
    * @alias Map
    * @classdesc Represents a Sync Map, which stores an unordered set of key:value pairs.
    * Use the {@link Client#map} method to obtain a reference to a Sync Map.
    * @property {String} sid An immutable identifier (a SID) assigned by the system on creation.
    * @property {String} [uniqueName=null] - An optional immutable identifier that may be assigned by the
    * programmer to this map on creation. Unique among other Maps.
    * @property {Date} dateUpdated Date when the Map was last updated.
    *
    * @fires Map#removed
    * @fires Map#itemAdded
    * @fires Map#itemRemoved
    * @fires Map#itemUpdated
    */
  @JSImport("twilio-sync", "SyncMap")
  @js.native
  class SyncMap protected ()
    extends typingsSlinky.twilioSync.syncmapMod.SyncMap {
    def this(syncMapImpl: SyncMapImpl) = this()
  }
  
  /**
    * @class
    * @classdesc Represents an individual element in a Sync Map.
    * @alias MapItem
    * @property {String} key The identifier that maps to this item within the containing Map.
    * @property {Object} value The contents of the item.
    * @property {Date} dateUpdated Date when the Map Item was last updated, given in UTC ISO 8601 format (e.g., '2018-04-26T15:23:19.732Z')
    */
  @JSImport("twilio-sync", "SyncMapItem")
  @js.native
  class SyncMapItem protected () extends MapItem {
    /**
      * @private
      * @constructor
      */
    def this(descriptor: MapItemDescriptor) = this()
  }
}
