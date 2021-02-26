package typingsSlinky.winrtUwp.global.Windows.Networking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
object XboxLive {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
  @js.native
  abstract class XboxLiveDeviceAddress ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress
  object XboxLiveDeviceAddress {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param base64 This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.createFromSnapshotBase64")
    @js.native
    def createFromSnapshotBase64(base64: String): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.createFromSnapshotBuffer")
    @js.native
    def createFromSnapshotBuffer(buffer: IBuffer): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.createFromSnapshotBytes")
    @js.native
    def createFromSnapshotBytes(buffer: js.Array[Double]): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.getLocal")
    @js.native
    def getLocal(): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress.maxSnapshotBytesSize")
    @js.native
    def maxSnapshotBytesSize: Double = js.native
    @scala.inline
    def maxSnapshotBytesSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSnapshotBytesSize")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
  @js.native
  abstract class XboxLiveEndpointPair ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair
  object XboxLiveEndpointPair {
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remotePort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair.findEndpointPairByHostNamesAndPorts")
    @js.native
    def findEndpointPairByHostNamesAndPorts(
      localHostName: typingsSlinky.winrtUwp.Windows.Networking.HostName,
      localPort: String,
      remoteHostName: typingsSlinky.winrtUwp.Windows.Networking.HostName,
      remotePort: String
    ): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair.findEndpointPairBySocketAddressBytes")
    @js.native
    def findEndpointPairBySocketAddressBytes(localSocketAddress: js.Array[Double], remoteSocketAddress: js.Array[Double]): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors")
  @js.native
  object XboxLiveEndpointPairCreationBehaviors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors with Double
      ] = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.none with Double = js.native
    
    /* 1 */ val reevaluatePath: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.reevaluatePath with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult")
  @js.native
  abstract class XboxLiveEndpointPairCreationResult ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus")
  @js.native
  object XboxLiveEndpointPairCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus with Double
      ] = js.native
    
    /* 4 */ val canceled: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.canceled with Double = js.native
    
    /* 3 */ val localSystemNotAuthorized: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized with Double = js.native
    
    /* 2 */ val noCompatibleNetworkPaths: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths with Double = js.native
    
    /* 1 */ val noLocalNetworks: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noLocalNetworks with Double = js.native
    
    /* 7 */ val refusedDueToConfiguration: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration with Double = js.native
    
    /* 6 */ val remoteSystemNotAuthorized: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized with Double = js.native
    
    /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.succeeded with Double = js.native
    
    /* 5 */ val timedOut: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.timedOut with Double = js.native
    
    /* 8 */ val unexpectedInternalError: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.unexpectedInternalError with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairState")
  @js.native
  object XboxLiveEndpointPairState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState with Double
      ] = js.native
    
    /* 2 */ val creatingInbound: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingInbound with Double = js.native
    
    /* 1 */ val creatingOutbound: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingOutbound with Double = js.native
    
    /* 6 */ val deleted: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deleted with Double = js.native
    
    /* 4 */ val deletingLocally: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deletingLocally with Double = js.native
    
    /* 0 */ val invalid: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.invalid with Double = js.native
    
    /* 3 */ val ready: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.ready with Double = js.native
    
    /* 5 */ val remoteEndpointTerminating: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.remoteEndpointTerminating with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs")
  @js.native
  abstract class XboxLiveEndpointPairStateChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
  @js.native
  abstract class XboxLiveEndpointPairTemplate ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
  object XboxLiveEndpointPairTemplate {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate.getTemplateByName")
    @js.native
    def getTemplateByName(name: String): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate.templates")
    @js.native
    def templates: IVectorView[typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate] = js.native
    @scala.inline
    def templates_=(x: IVectorView[typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templates")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs")
  @js.native
  abstract class XboxLiveInboundEndpointPairCreatedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveNetworkAccessKind")
  @js.native
  object XboxLiveNetworkAccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind with Double
      ] = js.native
    
    /* 1 */ val moderate: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.moderate with Double = js.native
    
    /* 0 */ val open: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.open with Double = js.native
    
    /* 2 */ val strict: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.strict with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
  @js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  class XboxLiveQualityOfServiceMeasurement ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement
  object XboxLiveQualityOfServiceMeasurement {
    
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement")
    @js.native
    val ^ : js.Any = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.clearPrivatePayload")
    @js.native
    def clearPrivatePayload(): Unit = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemInboundBandwidthConstrained")
    @js.native
    def isSystemInboundBandwidthConstrained: Boolean = js.native
    @scala.inline
    def isSystemInboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemInboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.isSystemOutboundBandwidthConstrained")
    @js.native
    def isSystemOutboundBandwidthConstrained: Boolean = js.native
    @scala.inline
    def isSystemOutboundBandwidthConstrained_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSystemOutboundBandwidthConstrained")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxPrivatePayloadSize")
    @js.native
    def maxPrivatePayloadSize: Double = js.native
    @scala.inline
    def maxPrivatePayloadSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxPrivatePayloadSize")(x.asInstanceOf[js.Any])
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.maxSimultaneousProbeConnections")
    @js.native
    def maxSimultaneousProbeConnections: Double = js.native
    @scala.inline
    def maxSimultaneousProbeConnections_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSimultaneousProbeConnections")(x.asInstanceOf[js.Any])
    
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param payload This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.publishPrivatePayloadBytes")
    @js.native
    def publishPrivatePayloadBytes(payload: js.Array[Double]): Unit = js.native
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    /* static member */
    @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement.publishedPrivatePayload")
    @js.native
    def publishedPrivatePayload: IBuffer = js.native
    @scala.inline
    def publishedPrivatePayload_=(x: IBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publishedPrivatePayload")(x.asInstanceOf[js.Any])
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus")
  @js.native
  object XboxLiveQualityOfServiceMeasurementStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus with Double
      ] = js.native
    
    /* 7 */ val canceled: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.canceled with Double = js.native
    
    /* 1 */ val inProgress: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgress with Double = js.native
    
    /* 2 */ val inProgressWithProvisionalResults: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.inProgressWithProvisionalResults with Double = js.native
    
    /* 6 */ val localSystemNotAuthorized: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.localSystemNotAuthorized with Double = js.native
    
    /* 5 */ val noCompatibleNetworkPaths: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noCompatibleNetworkPaths with Double = js.native
    
    /* 4 */ val noLocalNetworks: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.noLocalNetworks with Double = js.native
    
    /* 0 */ val notStarted: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.notStarted with Double = js.native
    
    /* 10 */ val refusedDueToConfiguration: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.refusedDueToConfiguration with Double = js.native
    
    /* 9 */ val remoteSystemNotAuthorized: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.remoteSystemNotAuthorized with Double = js.native
    
    /* 3 */ val succeeded: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.succeeded with Double = js.native
    
    /* 8 */ val timedOut: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.timedOut with Double = js.native
    
    /* 11 */ val unexpectedInternalError: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus.unexpectedInternalError with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric")
  @js.native
  object XboxLiveQualityOfServiceMetric extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric with Double
      ] = js.native
    
    /* 6 */ val averageInboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageInboundBitsPerSecond with Double = js.native
    
    /* 0 */ val averageLatencyInMilliseconds: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageLatencyInMilliseconds with Double = js.native
    
    /* 3 */ val averageOutboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageOutboundBitsPerSecond with Double = js.native
    
    /* 8 */ val maxInboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxInboundBitsPerSecond with Double = js.native
    
    /* 2 */ val maxLatencyInMilliseconds: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxLatencyInMilliseconds with Double = js.native
    
    /* 5 */ val maxOutboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxOutboundBitsPerSecond with Double = js.native
    
    /* 7 */ val minInboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minInboundBitsPerSecond with Double = js.native
    
    /* 1 */ val minLatencyInMilliseconds: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minLatencyInMilliseconds with Double = js.native
    
    /* 4 */ val minOutboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minOutboundBitsPerSecond with Double = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult")
  @js.native
  abstract class XboxLiveQualityOfServiceMetricResult ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult")
  @js.native
  abstract class XboxLiveQualityOfServicePrivatePayloadResult ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSGlobal("Windows.Networking.XboxLive.XboxLiveSocketKind")
  @js.native
  object XboxLiveSocketKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind with Double
      ] = js.native
    
    /* 1 */ val datagram: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.datagram with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.none with Double = js.native
    
    /* 2 */ val stream: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.stream with Double = js.native
  }
}
