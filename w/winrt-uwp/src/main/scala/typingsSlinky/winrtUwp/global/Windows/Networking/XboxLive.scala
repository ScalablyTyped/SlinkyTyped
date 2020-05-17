package typingsSlinky.winrtUwp.global.Windows.Networking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive")
@js.native
object XboxLive extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveDeviceAddress ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPair ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPairCreationResult ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPairStateChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveEndpointPairTemplate ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveInboundEndpointPairCreatedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  class XboxLiveQualityOfServiceMeasurement ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveQualityOfServiceMetricResult ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  abstract class XboxLiveQualityOfServicePrivatePayloadResult ()
    extends typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult
  
  /* static members */
  @js.native
  object XboxLiveDeviceAddress extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var maxSnapshotBytesSize: Double = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param base64 This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def createFromSnapshotBase64(base64: String): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def createFromSnapshotBuffer(buffer: IBuffer): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def createFromSnapshotBytes(buffer: js.Array[Double]): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def getLocal(): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveDeviceAddress = js.native
  }
  
  /* static members */
  @js.native
  object XboxLiveEndpointPair extends js.Object {
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param localPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remoteHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param remotePort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
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
    def findEndpointPairBySocketAddressBytes(localSocketAddress: js.Array[Double], remoteSocketAddress: js.Array[Double]): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPair = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveEndpointPairCreationBehaviors extends js.Object {
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.none with Double = js.native
    /* 1 */ val reevaluatePath: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors.reevaluatePath with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveEndpointPairCreationStatus extends js.Object {
    /* 4 */ val canceled: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.canceled with Double = js.native
    /* 3 */ val localSystemNotAuthorized: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.localSystemNotAuthorized with Double = js.native
    /* 2 */ val noCompatibleNetworkPaths: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noCompatibleNetworkPaths with Double = js.native
    /* 1 */ val noLocalNetworks: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.noLocalNetworks with Double = js.native
    /* 7 */ val refusedDueToConfiguration: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.refusedDueToConfiguration with Double = js.native
    /* 6 */ val remoteSystemNotAuthorized: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.remoteSystemNotAuthorized with Double = js.native
    /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.succeeded with Double = js.native
    /* 5 */ val timedOut: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.timedOut with Double = js.native
    /* 8 */ val unexpectedInternalError: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus.unexpectedInternalError with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveEndpointPairState extends js.Object {
    /* 2 */ val creatingInbound: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingInbound with Double = js.native
    /* 1 */ val creatingOutbound: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingOutbound with Double = js.native
    /* 6 */ val deleted: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deleted with Double = js.native
    /* 4 */ val deletingLocally: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deletingLocally with Double = js.native
    /* 0 */ val invalid: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.invalid with Double = js.native
    /* 3 */ val ready: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.ready with Double = js.native
    /* 5 */ val remoteEndpointTerminating: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.remoteEndpointTerminating with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object XboxLiveEndpointPairTemplate extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var templates: IVectorView[typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate] = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def getTemplateByName(name: String): typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveNetworkAccessKind extends js.Object {
    /* 1 */ val moderate: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.moderate with Double = js.native
    /* 0 */ val open: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.open with Double = js.native
    /* 2 */ val strict: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.strict with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object XboxLiveQualityOfServiceMeasurement extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var isSystemInboundBandwidthConstrained: Boolean = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var isSystemOutboundBandwidthConstrained: Boolean = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var maxPrivatePayloadSize: Double = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var maxSimultaneousProbeConnections: Double = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    var publishedPrivatePayload: IBuffer = js.native
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    def clearPrivatePayload(): Unit = js.native
    /**
      * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      * @param payload This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
      */
    def publishPrivatePayloadBytes(payload: js.Array[Double]): Unit = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveQualityOfServiceMeasurementStatus extends js.Object {
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveQualityOfServiceMetric extends js.Object {
    /* 6 */ val averageInboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageInboundBitsPerSecond with Double = js.native
    /* 0 */ val averageLatencyInMilliseconds: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageLatencyInMilliseconds with Double = js.native
    /* 3 */ val averageOutboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.averageOutboundBitsPerSecond with Double = js.native
    /* 8 */ val maxInboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxInboundBitsPerSecond with Double = js.native
    /* 2 */ val maxLatencyInMilliseconds: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxLatencyInMilliseconds with Double = js.native
    /* 5 */ val maxOutboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.maxOutboundBitsPerSecond with Double = js.native
    /* 7 */ val minInboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minInboundBitsPerSecond with Double = js.native
    /* 1 */ val minLatencyInMilliseconds: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minLatencyInMilliseconds with Double = js.native
    /* 4 */ val minOutboundBitsPerSecond: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric.minOutboundBitsPerSecond with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric with Double
      ] = js.native
  }
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object XboxLiveSocketKind extends js.Object {
    /* 1 */ val datagram: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.datagram with Double = js.native
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.none with Double = js.native
    /* 2 */ val stream: typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.stream with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.XboxLive.XboxLiveSocketKind with Double
      ] = js.native
  }
  
}

