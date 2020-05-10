package typingsSlinky.webgme

import typingsSlinky.webgme.webgmeStrings.ZSSHA
import typingsSlinky.webgme.webgmeStrings.plainSHA1
import typingsSlinky.webgme.webgmeStrings.rand160Bits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoMerge extends js.Object {
  /**
    * (N.B. Experimental feature) 
    * If enable, incoming commits to branches that initially 
    * were FORKED will be attempted to be merged with the head of the branch. 
    * Use with caution as larger (+100k nodes) projects can slow down the commit rate.
    *   config.storage.autoMerge.enable = false;
    */
  var autoMerge: AnonEnable = js.native
  /**
    * If true, events regarding project/branch creation/deletion 
    * are only broadcasted and not emitted back to the socket who made the change. 
    * Only modify this if you are writing a custom GUI.
    *  config.storage.broadcastProjectEvents = false;
    */
  var broadcastProjectEvents: Boolean = js.native
  /**
    * Number of core-objects stored before emptying cache (server side).
    *  config.storage.cache = 2000;
    */
  var cache: Double = js.native
  /**
    * Number of core-objects stored before emptying cache (client side).
    *   config.storage.clientCache = 2000;
    */
  var clientCache: Double = js.native
  var database: AnonType = js.native
  /**
    * Since v2.6.2 patched objects on the server are being 
    * checked for consistency w.r.t. the provided hash 
    * before insertion into database. 
    * If true, no checking at all will take place.
    *   config.storage.disableHashChecks = false;
    */
  var disableHashChecks: Boolean = js.native
  /**
    * Algorithm used when hashing the objects in the database, 
    * can be 'plainSHA1', 'rand160Bits' or 'ZSSHA'.
    *   config.storage.keyType = 'plainSha';
    */
  var keyType: plainSHA1 | rand160Bits | ZSSHA = js.native
  /**
    * Size of bucket before triggering a load of objects from the server.
    *   config.storage.loadBucketSize = 100;
    */
  var loadBucketSize: Double = js.native
  /**
    * Time in milliseconds (after a new bucket has been created) 
    * before triggering a load of objects from the server.
    *   config.storage.loadBucketTimer = 10;
    */
  var loadBucketTimer: Double = js.native
  /**
    * If greater than -1, the maximum number of core objects 
    * that will be emitted to other clients. 
    * N.B. this only applies to newly created nodes, 
    * any modified data will always be sent as patches.
    *   config.storage.maxEmittedCoreObjects = -1;
    */
  var maxEmittedCoreObjects: Double = js.native
  /**
    * Options passed to database client 
    * (unless mongo is specified, in that case config.mongo.options are used).
    *   config.storage.database.options = '{}';
    */
  var options: String = js.native
  /**
    * If config.storage.disableHashChecks is set to 
    * false and this option is set to true, 
    * will not insert objects if the hashes do not match. 
    * Set this to false to only log the errors.
    *   config.storage.requireHashesToMatch = true;
    */
  var requireHashesToMatch: Boolean = js.native
}

object AnonAutoMerge {
  @scala.inline
  def apply(
    autoMerge: AnonEnable,
    broadcastProjectEvents: Boolean,
    cache: Double,
    clientCache: Double,
    database: AnonType,
    disableHashChecks: Boolean,
    keyType: plainSHA1 | rand160Bits | ZSSHA,
    loadBucketSize: Double,
    loadBucketTimer: Double,
    maxEmittedCoreObjects: Double,
    options: String,
    requireHashesToMatch: Boolean
  ): AnonAutoMerge = {
    val __obj = js.Dynamic.literal(autoMerge = autoMerge.asInstanceOf[js.Any], broadcastProjectEvents = broadcastProjectEvents.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], clientCache = clientCache.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], disableHashChecks = disableHashChecks.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], loadBucketSize = loadBucketSize.asInstanceOf[js.Any], loadBucketTimer = loadBucketTimer.asInstanceOf[js.Any], maxEmittedCoreObjects = maxEmittedCoreObjects.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], requireHashesToMatch = requireHashesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoMerge]
  }
  @scala.inline
  implicit class AnonAutoMergeOps[Self <: AnonAutoMerge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMerge(value: AnonEnable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcastProjectEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastProjectEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientCache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabase(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableHashChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHashChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyType(value: plainSHA1 | rand160Bits | ZSSHA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBucketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBucketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBucketTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBucketTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxEmittedCoreObjects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEmittedCoreObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireHashesToMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireHashesToMatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

