package typingsSlinky.winrtUwp.global.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.IPerceptionFrameProvider
import typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.IPerceptionFrameProviderManager
import typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionStartFaceAuthenticationHandler
import typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionStopFaceAuthenticationHandler
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Quaternion
import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Vector3
import typingsSlinky.winrtUwp.Windows.Foundation.Size
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types for implementing providers of perception frames. */
object Provider {
  
  /** A string used to identify the type classification of a frame. */
  @JSGlobal("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind")
  @js.native
  abstract class KnownPerceptionFrameKind ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.KnownPerceptionFrameKind
  object KnownPerceptionFrameKind {
    
    @JSGlobal("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the string representing the Color FrameKind of a PerceptionFrameProviderInfo. */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind.color")
    @js.native
    def color: String = js.native
    @scala.inline
    def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    /** Gets the string representing the Depth FrameKind of a PerceptionFrameProviderInfo. */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind.depth")
    @js.native
    def depth: String = js.native
    @scala.inline
    def depth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
    
    /** Gets the string representing the Infrared FrameKind of a PerceptionFrameProviderInfo. */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.KnownPerceptionFrameKind.infrared")
    @js.native
    def infrared: String = js.native
    @scala.inline
    def infrared_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infrared")(x.asInstanceOf[js.Any])
  }
  
  /** A group of IPerceptionFrameProvider identifiers to be controlled together. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionControlGroup")
  @js.native
  class PerceptionControlGroup protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionControlGroup {
    /**
      * Creates a PerceptionControlGroup containing the IPerceptionFrameProviders with the ids specified.
      * @param ids A list of the unique identifiers associated with the grouped IPerceptionFrameProviders. To be controllable, the id must match the associated PerceptionFrameProviderInfo::Id property.
      */
    def this(ids: IIterable[String]) = this()
  }
  
  /** A description of the physical position and orientation of a device specified by the IPerceptionFrameProvider's unique identifier (PerceptionFrameProviderInfo::Id) sharing a common coordinate frame of other PerceptionCorrelations that will be combined into a PerceptionCorrelationGroup. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionCorrelation")
  @js.native
  class PerceptionCorrelation protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelation {
    /**
      * Initializes a new PerceptionCorrelation instance.
      * @param targetId The unique identifier of the IPerceptionFrameProvider being described.
      * @param position The position of the device in a common coordinate frame of all members of a PerceptionCorrelationGroup.
      * @param orientation The orientation of the device in a common coordinate frame of all members of a PerceptionCorrelationGroup.
      */
    def this(targetId: String, position: Vector3, orientation: Quaternion) = this()
  }
  
  /** A collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionCorrelationGroup")
  @js.native
  class PerceptionCorrelationGroup protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelationGroup {
    /**
      * Initializes a new PerceptionCorrelationGroup from a collection of one or more PerceptionCorrelation objects describing multiple providers in a common coordinate frame.
      * @param relativeLocations The collection of PerceptionCorrelations describing multiple providers in a common coordinate frame.
      */
    def this(relativeLocations: IIterable[typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelation]) = this()
  }
  
  /** A group of unique identifiers specifying IPerceptionFrameProviders that share handlers for entering and exiting Face Authentication mode. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup")
  @js.native
  class PerceptionFaceAuthenticationGroup protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup {
    /**
      * Initializes a new PerceptionFaceAuthenticationGroup instance.
      * @param ids The collection of unique identifiers which maps to IPerceptionFrameProviders via PerceptionFrameProviderInfo::Id.
      * @param startHandler The handler to invoke when this group is requested to enter Face Authentication mode returning if it's ready.
      * @param stopHandler The handler to invoke when this group is leaving Face Authentication mode after startHandler is called and returned true.
      */
    def this(
      ids: IIterable[String],
      startHandler: PerceptionStartFaceAuthenticationHandler,
      stopHandler: PerceptionStopFaceAuthenticationHandler
    ) = this()
  }
  
  /** Represents a frame of data from the device. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrame")
  @js.native
  abstract class PerceptionFrame ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrame
  
  /** A specific set of properties describing a unique IPerceptionFrameProvider. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo")
  @js.native
  /** Initializes a new PerceptionFrameProviderInfo instance. */
  class PerceptionFrameProviderInfo ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo
  
  /** Static methods for managing IPerceptionFrameProvider registration and unregistration, PerceptionFaceAuthenticationGroup registration and unregistration, PerceptionControlGroup registration and unregistration, PerceptionCorrelationGroup registration and unregistration, IPerceptionFrameProvider availablity, and publishing a new PerceptionFrame for an IPerceptionFrameProvider. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService")
  @js.native
  abstract class PerceptionFrameProviderManagerService ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService
  object PerceptionFrameProviderManagerService {
    
    /**
      * Sends the PerceptionFrame to the service to tell any apps listening for frames for the provided provider. Frames aren't expected to be published before IPerceptionFrameProvider::Start() is called or after IPerceptionFrameProvider::Stop() is called.
      * @param provider The IPerceptionFrameProvider which produced the frame.
      * @param frame The PerceptionFrame that was produced and should be sent to apps.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.publishFrameForProvider")
    @js.native
    def publishFrameForProvider(
      provider: IPerceptionFrameProvider,
      frame: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrame
    ): Unit = js.native
    
    /**
      * Registers a PerceptionControlGroup associated with the IPerceptionFrameProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param controlGroup The group of IPerceptionFrameProvider(s) to control atomically.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.registerControlGroup")
    @js.native
    def registerControlGroup(
      manager: IPerceptionFrameProviderManager,
      controlGroup: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionControlGroup
    ): Unit = js.native
    
    /**
      * Registers a PerceptionCorrelationGroup associated with the IPerceptionFrameProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param correlationGroup The group of PerceptionCorrelations(s) to control atomically.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.registerCorrelationGroup")
    @js.native
    def registerCorrelationGroup(
      manager: IPerceptionFrameProviderManager,
      correlationGroup: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelationGroup
    ): Unit = js.native
    
    /**
      * Registers a PerceptionFaceAuthenticationGroup associated with the given IPerceptionProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param faceAuthenticationGroup The group of IPerceptionFrameProvider(s) to atomically control.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.registerFaceAuthenticationGroup")
    @js.native
    def registerFaceAuthenticationGroup(
      manager: IPerceptionFrameProviderManager,
      faceAuthenticationGroup: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup
    ): Unit = js.native
    
    /**
      * Registers the PerceptionFrameProviderInfo in association with the given IPerceptionFrameProviderManager.
      * @param manager The manager which can provide the IPerceptionFrameProvider associated with the info.
      * @param frameProviderInfo The PerceptionFrameProviderInfo which identifies the available IPerceptionFrameProvider.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.registerFrameProviderInfo")
    @js.native
    def registerFrameProviderInfo(
      manager: IPerceptionFrameProviderManager,
      frameProviderInfo: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo
    ): Unit = js.native
    
    /**
      * Removes the registration of a previously registered PerceptionControlGroup.
      * @param manager The manager that owns the lifetime of the group.
      * @param controlGroup The group of IPerceptionFrameProvider(s) to prevent from being controlled.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.unregisterControlGroup")
    @js.native
    def unregisterControlGroup(
      manager: IPerceptionFrameProviderManager,
      controlGroup: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionControlGroup
    ): Unit = js.native
    
    /**
      * Unregisters a PerceptionCorrelationGroup associated with the IPerceptionFrameProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param correlationGroup The PerceptionCorrelationGroup to unregister.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.unregisterCorrelationGroup")
    @js.native
    def unregisterCorrelationGroup(
      manager: IPerceptionFrameProviderManager,
      correlationGroup: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelationGroup
    ): Unit = js.native
    
    /**
      * Unregisters a PerceptionFaceAuthenticationGroup in association with the given IPerceptionProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param faceAuthenticationGroup The PerceptionFaceAuthenticationGroup to unregister.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.unregisterFaceAuthenticationGroup")
    @js.native
    def unregisterFaceAuthenticationGroup(
      manager: IPerceptionFrameProviderManager,
      faceAuthenticationGroup: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup
    ): Unit = js.native
    
    /**
      * Unregisters the PerceptionFrameProviderInfo in association with the given IPerceptionProviderManager.
      * @param manager The manager which previously registered this info.
      * @param frameProviderInfo The PerceptionFrameProviderInfo which identifies the IPerceptionFrameProvider.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.unregisterFrameProviderInfo")
    @js.native
    def unregisterFrameProviderInfo(
      manager: IPerceptionFrameProviderManager,
      frameProviderInfo: typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo
    ): Unit = js.native
    
    /**
      * Sets whether or not the IPerceptionFrameProvider is available.
      * @param provider The provider to set availability for.
      * @param available Whether or not the provider is available.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService.updateAvailabilityForProvider")
    @js.native
    def updateAvailabilityForProvider(provider: IPerceptionFrameProvider, available: Boolean): Unit = js.native
  }
  
  /** A request from an app that's in control of this IPerceptionFrameProvider to update a property. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionPropertyChangeRequest")
  @js.native
  abstract class PerceptionPropertyChangeRequest ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionPropertyChangeRequest
  
  /** An allocator that can create PerceptionFrames directly which can be written into or copied from Windows::Media::VideoFrame into a PerceptionFrame. */
  @JSGlobal("Windows.Devices.Perception.Provider.PerceptionVideoFrameAllocator")
  @js.native
  class PerceptionVideoFrameAllocator protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider.PerceptionVideoFrameAllocator {
    /**
      * Initializes a new PerceptionVideoFrameAllocator with the required properties for use by the IPerceptionFrameProvider to create PerceptionFrames published via PerceptionFrameProviderManagerService::PublishFrameForProvider.
      * @param maxOutstandingFrameCountForWrite This is the number of buffers in flight required by the FrameProvider to produce its * frames at framerate. The suggestion is at least 2.
      * @param format The Windows::Graphics::Imaging::BitmapPixelFormat describing the format of the bytes of the frame.
      * @param resolution The resolution in pixels of the frame.
      * @param alpha The Windows::Graphics::Imaging::BitmapAlphaMode describing how transparency is handled in the pixels.
      */
    def this(
      maxOutstandingFrameCountForWrite: Double,
      format: BitmapPixelFormat,
      resolution: Size,
      alpha: BitmapAlphaMode
    ) = this()
  }
}
