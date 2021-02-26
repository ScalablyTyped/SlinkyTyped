package typingsSlinky.vortexWebClient

import typingsSlinky.vortexWebClient.DDS_.EntityQos
import typingsSlinky.vortexWebClient.DDS_.Policy
import typingsSlinky.vortexWebClient.DDS_.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DDS_ {
    
    @JSGlobal("DDS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("DDS.ContentFilter")
    @js.native
    def ContentFilter(expr: String): Policy = js.native
    
    @JSGlobal("DDS.DataCache")
    @js.native
    class DataCache protected ()
      extends typingsSlinky.vortexWebClient.DDS_.DataCache {
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
    
    @JSGlobal("DDS.DataReader")
    @js.native
    class DataReader protected ()
      extends typingsSlinky.vortexWebClient.DDS_.DataReader {
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
      def this(runtime: Runtime, topic: typingsSlinky.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("DDS.DataReaderQos")
    @js.native
    class DataReaderQos protected () extends EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("DDS.DataReaderQos")
    @js.native
    def DataReaderQos: EntityQos = js.native
    @scala.inline
    def DataReaderQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataReaderQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DDS.DataWriter")
    @js.native
    class DataWriter protected ()
      extends typingsSlinky.vortexWebClient.DDS_.DataWriter {
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
      def this(runtime: Runtime, topic: typingsSlinky.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("DDS.DataWriterQos")
    @js.native
    class DataWriterQos protected () extends EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("DDS.DataWriterQos")
    @js.native
    def DataWriterQos: EntityQos = js.native
    @scala.inline
    def DataWriterQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataWriterQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DDS.Durability")
    @js.native
    class Durability () extends Policy
    /* static members */
    object Durability {
      
      @JSGlobal("DDS.Durability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Persistent - Persistent durability policy
        */
      @JSGlobal("DDS.Durability.Persistent")
      @js.native
      def Persistent: js.Any = js.native
      @scala.inline
      def Persistent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Persistent")(x.asInstanceOf[js.Any])
      
      /**
        * Transient - Transient durability policy
        */
      @JSGlobal("DDS.Durability.Transient")
      @js.native
      def Transient: js.Any = js.native
      
      /**
        * TransientLocal - TransientLocal durability policy
        */
      @JSGlobal("DDS.Durability.TransientLocal")
      @js.native
      def TransientLocal: js.Any = js.native
      @scala.inline
      def TransientLocal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransientLocal")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def Transient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transient")(x.asInstanceOf[js.Any])
      
      /**
        * Volatile - Volatile durability policy
        */
      @JSGlobal("DDS.Durability.Volatile")
      @js.native
      def Volatile: js.Any = js.native
      @scala.inline
      def Volatile_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Volatile")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("DDS.DurabilityKind")
    @js.native
    object DurabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.vortexWebClient.DDS_.DurabilityKind with Double] = js.native
      
      /* 3 */ val Persistent: typingsSlinky.vortexWebClient.DDS_.DurabilityKind.Persistent with Double = js.native
      
      /* 2 */ val Transient: typingsSlinky.vortexWebClient.DDS_.DurabilityKind.Transient with Double = js.native
      
      /* 1 */ val TransientLocal: typingsSlinky.vortexWebClient.DDS_.DurabilityKind.TransientLocal with Double = js.native
      
      /* 0 */ val Volatile: typingsSlinky.vortexWebClient.DDS_.DurabilityKind.Volatile with Double = js.native
    }
    
    @JSGlobal("DDS.History")
    @js.native
    class History () extends Policy
    /* static members */
    object History {
      
      @JSGlobal("DDS.History")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * KeepAll - KEEP_ALL qos policy
        */
      @JSGlobal("DDS.History.KeepAll")
      @js.native
      def KeepAll: js.Any = js.native
      @scala.inline
      def KeepAll_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepAll")(x.asInstanceOf[js.Any])
      
      /**
        * KeepLast - KEEP_LAST qos policy
        */
      @JSGlobal("DDS.History.KeepLast")
      @js.native
      def KeepLast: js.Any = js.native
      @scala.inline
      def KeepLast_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepLast")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("DDS.HistoryKind")
    @js.native
    object HistoryKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.vortexWebClient.DDS_.HistoryKind with Double] = js.native
      
      /* 0 */ val KeepAll: typingsSlinky.vortexWebClient.DDS_.HistoryKind.KeepAll with Double = js.native
      
      /* 1 */ val KeepLast: typingsSlinky.vortexWebClient.DDS_.HistoryKind.KeepLast with Double = js.native
    }
    
    @JSGlobal("DDS.Partition")
    @js.native
    def Partition(policies: String*): Policy = js.native
    
    @JSGlobal("DDS.Reliability")
    @js.native
    class Reliability () extends Policy
    /* static members */
    object Reliability {
      
      @JSGlobal("DDS.Reliability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * BestEffort - 'BestEffort' reliability policy
        */
      @JSGlobal("DDS.Reliability.BestEffort")
      @js.native
      def BestEffort: js.Any = js.native
      @scala.inline
      def BestEffort_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BestEffort")(x.asInstanceOf[js.Any])
      
      /**
        * Reliable - 'Reliable' reliability policy
        */
      @JSGlobal("DDS.Reliability.Reliable")
      @js.native
      def Reliable: js.Any = js.native
      @scala.inline
      def Reliable_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reliable")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("DDS.ReliabilityKind")
    @js.native
    object ReliabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.vortexWebClient.DDS_.ReliabilityKind with Double] = js.native
      
      /* 1 */ val BestEffort: typingsSlinky.vortexWebClient.DDS_.ReliabilityKind.BestEffort with Double = js.native
      
      /* 0 */ val Reliable: typingsSlinky.vortexWebClient.DDS_.ReliabilityKind.Reliable with Double = js.native
    }
    
    @JSGlobal("DDS.TimeFilter")
    @js.native
    def TimeFilter(period: Double): Policy = js.native
    
    @JSGlobal("DDS.Topic")
    @js.native
    class Topic protected ()
      extends typingsSlinky.vortexWebClient.DDS_.Topic {
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("DDS.TopicQos")
    @js.native
    class TopicQos protected () extends EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("DDS.TopicQos")
    @js.native
    def TopicQos: EntityQos = js.native
    @scala.inline
    def TopicQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopicQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DDS.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    object runtime {
      
      @JSGlobal("DDS.runtime")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("DDS.runtime.Runtime")
      @js.native
      def Runtime: typingsSlinky.vortexWebClient.DDS_.Runtime = js.native
      
      /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
      @JSGlobal("DDS.runtime.Runtime")
      @js.native
      /**
        * Constructs a DDS Runtime object
        *
        * maintains the connection with the server, re-establish the connection
        * if dropped and mediates the `DataReader` and `DataWriter` communication.
        */
      class RuntimeCls () extends Runtime
      
      @scala.inline
      def Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(x.asInstanceOf[js.Any])
    }
  }
  
  /* was `typeof DDS` */
  object dds {
    
    @JSGlobal("dds")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("dds.ContentFilter")
    @js.native
    def ContentFilter(expr: String): Policy = js.native
    
    @JSGlobal("dds.DataCache")
    @js.native
    class DataCache protected ()
      extends typingsSlinky.vortexWebClient.dds.DataCache {
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
    
    @JSGlobal("dds.DataReader")
    @js.native
    class DataReader protected ()
      extends typingsSlinky.vortexWebClient.dds.DataReader {
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
      def this(runtime: Runtime, topic: typingsSlinky.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("dds.DataReaderQos")
    @js.native
    class DataReaderQos protected () extends EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("dds.DataReaderQos")
    @js.native
    def DataReaderQos: EntityQos = js.native
    @scala.inline
    def DataReaderQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataReaderQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dds.DataWriter")
    @js.native
    class DataWriter protected ()
      extends typingsSlinky.vortexWebClient.dds.DataWriter {
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
      def this(runtime: Runtime, topic: typingsSlinky.vortexWebClient.DDS_.Topic, qos: EntityQos) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("dds.DataWriterQos")
    @js.native
    class DataWriterQos protected () extends EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("dds.DataWriterQos")
    @js.native
    def DataWriterQos: EntityQos = js.native
    @scala.inline
    def DataWriterQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataWriterQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dds.Durability")
    @js.native
    class Durability () extends Policy
    /* static members */
    object Durability {
      
      @JSGlobal("dds.Durability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Persistent - Persistent durability policy
        */
      @JSGlobal("dds.Durability.Persistent")
      @js.native
      def Persistent: js.Any = js.native
      @scala.inline
      def Persistent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Persistent")(x.asInstanceOf[js.Any])
      
      /**
        * Transient - Transient durability policy
        */
      @JSGlobal("dds.Durability.Transient")
      @js.native
      def Transient: js.Any = js.native
      
      /**
        * TransientLocal - TransientLocal durability policy
        */
      @JSGlobal("dds.Durability.TransientLocal")
      @js.native
      def TransientLocal: js.Any = js.native
      @scala.inline
      def TransientLocal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransientLocal")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def Transient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transient")(x.asInstanceOf[js.Any])
      
      /**
        * Volatile - Volatile durability policy
        */
      @JSGlobal("dds.Durability.Volatile")
      @js.native
      def Volatile: js.Any = js.native
      @scala.inline
      def Volatile_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Volatile")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("dds.DurabilityKind")
    @js.native
    object DurabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.vortexWebClient.dds.DurabilityKind with Double] = js.native
      
      /* 3 */ val Persistent: typingsSlinky.vortexWebClient.dds.DurabilityKind.Persistent with Double = js.native
      
      /* 2 */ val Transient: typingsSlinky.vortexWebClient.dds.DurabilityKind.Transient with Double = js.native
      
      /* 1 */ val TransientLocal: typingsSlinky.vortexWebClient.dds.DurabilityKind.TransientLocal with Double = js.native
      
      /* 0 */ val Volatile: typingsSlinky.vortexWebClient.dds.DurabilityKind.Volatile with Double = js.native
    }
    
    @JSGlobal("dds.History")
    @js.native
    class History () extends Policy
    /* static members */
    object History {
      
      @JSGlobal("dds.History")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * KeepAll - KEEP_ALL qos policy
        */
      @JSGlobal("dds.History.KeepAll")
      @js.native
      def KeepAll: js.Any = js.native
      @scala.inline
      def KeepAll_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepAll")(x.asInstanceOf[js.Any])
      
      /**
        * KeepLast - KEEP_LAST qos policy
        */
      @JSGlobal("dds.History.KeepLast")
      @js.native
      def KeepLast: js.Any = js.native
      @scala.inline
      def KeepLast_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeepLast")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("dds.HistoryKind")
    @js.native
    object HistoryKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.vortexWebClient.dds.HistoryKind with Double] = js.native
      
      /* 0 */ val KeepAll: typingsSlinky.vortexWebClient.dds.HistoryKind.KeepAll with Double = js.native
      
      /* 1 */ val KeepLast: typingsSlinky.vortexWebClient.dds.HistoryKind.KeepLast with Double = js.native
    }
    
    @JSGlobal("dds.Partition")
    @js.native
    def Partition(policies: String*): Policy = js.native
    
    @JSGlobal("dds.Reliability")
    @js.native
    class Reliability () extends Policy
    /* static members */
    object Reliability {
      
      @JSGlobal("dds.Reliability")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * BestEffort - 'BestEffort' reliability policy
        */
      @JSGlobal("dds.Reliability.BestEffort")
      @js.native
      def BestEffort: js.Any = js.native
      @scala.inline
      def BestEffort_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BestEffort")(x.asInstanceOf[js.Any])
      
      /**
        * Reliable - 'Reliable' reliability policy
        */
      @JSGlobal("dds.Reliability.Reliable")
      @js.native
      def Reliable: js.Any = js.native
      @scala.inline
      def Reliable_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reliable")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("dds.ReliabilityKind")
    @js.native
    object ReliabilityKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.vortexWebClient.dds.ReliabilityKind with Double] = js.native
      
      /* 1 */ val BestEffort: typingsSlinky.vortexWebClient.dds.ReliabilityKind.BestEffort with Double = js.native
      
      /* 0 */ val Reliable: typingsSlinky.vortexWebClient.dds.ReliabilityKind.Reliable with Double = js.native
    }
    
    @JSGlobal("dds.TimeFilter")
    @js.native
    def TimeFilter(period: Double): Policy = js.native
    
    @JSGlobal("dds.Topic")
    @js.native
    class Topic protected ()
      extends typingsSlinky.vortexWebClient.dds.Topic {
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("dds.TopicQos")
    @js.native
    class TopicQos protected () extends EntityQos {
      /**
        * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
        *
        * @param policies - list of policies for the Qos entity
        */
      def this(policies: Policy*) = this()
    }
    @JSGlobal("dds.TopicQos")
    @js.native
    def TopicQos: EntityQos = js.native
    @scala.inline
    def TopicQos_=(x: EntityQos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopicQos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dds.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    object runtime {
      
      @JSGlobal("dds.runtime")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("dds.runtime.Runtime")
      @js.native
      def Runtime: typingsSlinky.vortexWebClient.DDS_.Runtime = js.native
      
      /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
      @JSGlobal("dds.runtime.Runtime")
      @js.native
      /**
        * Constructs a DDS Runtime object
        *
        * maintains the connection with the server, re-establish the connection
        * if dropped and mediates the `DataReader` and `DataWriter` communication.
        */
      class RuntimeCls () extends Runtime
      
      @scala.inline
      def Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(x.asInstanceOf[js.Any])
    }
  }
}
