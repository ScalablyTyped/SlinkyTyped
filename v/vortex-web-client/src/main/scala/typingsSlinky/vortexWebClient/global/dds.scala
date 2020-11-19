package typingsSlinky.vortexWebClient.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vortexWebClient.DDS.EntityQos
import typingsSlinky.vortexWebClient.DDS.Policy
import typingsSlinky.vortexWebClient.anon.Runtime
import typingsSlinky.vortexWebClient.anon.TypeofDurability
import typingsSlinky.vortexWebClient.anon.TypeofHistory
import typingsSlinky.vortexWebClient.anon.TypeofReliability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the core Vortex-Web-Client javascript library. It includes the JavaScript API for DDS. This API allows
  * web applications to share data among them as well as with native DDS applications.
  */
@JSGlobal("dds")
@js.native
object dds extends js.Object {
  
  def ContentFilter(expr: String): Policy = js.native
  
  var DataReaderQos: EntityQos = js.native
  
  var DataWriterQos: EntityQos = js.native
  
  var Durability: TypeofDurability = js.native
  
  var History: TypeofHistory = js.native
  
  def Partition(policies: String*): Policy = js.native
  
  var Reliability: TypeofReliability = js.native
  
  def TimeFilter(period: Double): Policy = js.native
  
  var TopicQos: EntityQos = js.native
  
  var VERSION: String = js.native
  
  var runtime: Runtime = js.native
  
  @js.native
  class DataCache protected ()
    extends typingsSlinky.vortexWebClient.DDS.DataCache {
    /**
      * Constructs a `DataCache` with a given `depth`. If the `cache` parameter
      * is present, then the current cache is initialized with this parameter.
      *
      * Provides a way of storing and flexibly accessing the
      * data received through a `DataReader`. A `DataCache` is organized as
      * a map of queues. The depth of the queues is specified at construction
      * time.
      *
      * @param depth - cache size
      * @param cache - cache data structure
      */
    def this(depth: Double, cache: js.Any) = this()
  }
  @js.native
  object DataCache
    extends TopLevel[
          Instantiable2[/* depth */ Double, /* cache */ js.Any, typingsSlinky.vortexWebClient.DDS.DataCache]
        ]
  
  @js.native
  class DataReader protected ()
    extends typingsSlinky.vortexWebClient.DDS.DataReader {
    /**
      * Creates a `DataReader` for a given topic and a specific in a specific DDS runtime.
      *
      * A `DataReader` allows to read data for a given topic with a specific QoS. A `DataReader`
      * * goes through different states, it is intially disconnected and changes to the connected state
      * when the underlying transport connection is successfully established with the server. At this point
      * a `DataReader` can be explicitely closed or disconnected. A disconnection can happen as the result
      * of a network failure or server failure. Disconnection and reconnections are managed by the runtime.
      *
      * @param runtime - DDS Runtime
      * @param topic - DDS Topic
      * @param qos - DataReader quality of service
      */
    def this(
      runtime: typingsSlinky.vortexWebClient.DDS.Runtime,
      topic: typingsSlinky.vortexWebClient.DDS.Topic,
      qos: EntityQos
    ) = this()
  }
  @js.native
  object DataReader
    extends TopLevel[
          Instantiable3[
            /* runtime */ typingsSlinky.vortexWebClient.DDS.Runtime, 
            /* topic */ typingsSlinky.vortexWebClient.DDS.Topic, 
            /* qos */ EntityQos, 
            typingsSlinky.vortexWebClient.DDS.DataReader
          ]
        ]
  
  @js.native
  class DataWriter protected ()
    extends typingsSlinky.vortexWebClient.DDS.DataWriter {
    /**
      * Creates a `DataWriter` for a given topic and a specific in a specific DDS runtime
      *
      * defines a DDS data writer. This type
      * is used to write data for a specific topic with a given QoS.
      * A `DataWriter` goes through different states, it is intially disconnected and changes to the connected
      * state when the underlying transport connection is successfully established with the server.
      * At this point a `DataWriter` can be explicitely closed or disconnected. A disconnection can happen
      * as the result of a network failure or server failure. Disconnection and reconnections are managed by the
      * runtime.
      *
      * @param runtime - DDS Runtime
      * @param topic - DDS Topic
      * @param qos - DataWriter quality of service
      */
    def this(
      runtime: typingsSlinky.vortexWebClient.DDS.Runtime,
      topic: typingsSlinky.vortexWebClient.DDS.Topic,
      qos: EntityQos
    ) = this()
  }
  @js.native
  object DataWriter
    extends TopLevel[
          Instantiable3[
            /* runtime */ typingsSlinky.vortexWebClient.DDS.Runtime, 
            /* topic */ typingsSlinky.vortexWebClient.DDS.Topic, 
            /* qos */ EntityQos, 
            typingsSlinky.vortexWebClient.DDS.DataWriter
          ]
        ]
  
  @js.native
  class Topic protected ()
    extends typingsSlinky.vortexWebClient.DDS.Topic {
    /**
      * Creates a `Topic` in the domain `did`, named `tname`, having `qos` Qos,
      * for the type `ttype` whose registered name is `tregtype`
      * @param {number} did - DDS domain ID
      * @param {string} tname - topic name
      * @param {TopicQos} qos - topic Qos
      * @param {string} ttype - topic type. If not specified, a generic type is used.
      * @param {string} tregtype - topic registered type name. If not specified, 'ttype' is used.
      */
    def this(did: Double, tname: String, qos: EntityQos) = this()
    def this(did: Double, tname: String, qos: EntityQos, ttype: String) = this()
    def this(did: Double, tname: String, qos: EntityQos, ttype: js.UndefOr[scala.Nothing], tregtype: String) = this()
    def this(did: Double, tname: String, qos: EntityQos, ttype: String, tregtype: String) = this()
  }
  @js.native
  object Topic
    extends TopLevel[
          Instantiable5[
            /* did */ Double, 
            /* tname */ String, 
            /* qos */ EntityQos, 
            /* ttype */ js.UndefOr[String], 
            /* tregtype */ js.UndefOr[String], 
            typingsSlinky.vortexWebClient.DDS.Topic
          ]
        ]
}
