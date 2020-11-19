package typingsSlinky.winrtUwp.global.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.ApplicationModel.AppService.AppServiceTriggerDetails
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for handling voice commands in Cortana, entered by speech or text, to access features and functionality from a background app. When an app handles a voice command in the background it can display feedback on the Cortana canvas and communicate with the user using the Cortana voice. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands")
@js.native
object VoiceCommands extends js.Object {
  
  /** The command given to Cortana, using either speech or text, and routed to a background app. */
  @js.native
  abstract class VoiceCommand ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommand
  
  /** Contains event data for the VoiceCommandCompleted event. */
  @js.native
  abstract class VoiceCommandCompletedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletedEventArgs
  
  /** Specifies the possible reasons the voice command completed. */
  @js.native
  object VoiceCommandCompletionReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason with Double
      ] = js.native
    
    /* 5 */ val appLaunched: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.appLaunched with Double = js.native
    
    /* 3 */ val canceled: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.canceled with Double = js.native
    
    /* 1 */ val communicationFailed: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.communicationFailed with Double = js.native
    
    /* 6 */ val completed: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.completed with Double = js.native
    
    /* 2 */ val resourceLimitsExceeded: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.resourceLimitsExceeded with Double = js.native
    
    /* 4 */ val timeoutExceeded: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.timeoutExceeded with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletionReason.unknown with Double = js.native
  }
  
  /** The response to the question specified by the background app and shown on the Cortana confirmation screen. This screen is displayed when the background app service calls RequestConfirmationAsync . */
  @js.native
  abstract class VoiceCommandConfirmationResult ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandConfirmationResult
  
  /** An asset, containing image, text, and link data, provided by the background app service for display on the Cortana canvas. */
  @js.native
  /** Creates an instance of the VoiceCommandContentTile class. */
  class VoiceCommandContentTile ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile
  
  /** The layout template used to display a content tile on the Cortana canvas. */
  @js.native
  object VoiceCommandContentTileType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType with Double
      ] = js.native
    
    /* 0 */ val titleOnly: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleOnly with Double = js.native
    
    /* 6 */ val titleWith280x140Icon: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140Icon with Double = js.native
    
    /* 7 */ val titleWith280x140IconAndText: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140IconAndText with Double = js.native
    
    /* 2 */ val titleWith68x68Icon: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68Icon with Double = js.native
    
    /* 3 */ val titleWith68x68IconAndText: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68IconAndText with Double = js.native
    
    /* 4 */ val titleWith68x92Icon: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92Icon with Double = js.native
    
    /* 5 */ val titleWith68x92IconAndText: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92IconAndText with Double = js.native
    
    /* 1 */ val titleWithText: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWithText with Double = js.native
  }
  
  /** Enables operations on a specific installed command set. */
  @js.native
  abstract class VoiceCommandDefinition ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition
  
  /** A static class that enables installing command sets from a Voice Command Definition (VCD) file, and getting installed command sets. */
  @js.native
  abstract class VoiceCommandDefinitionManager ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager
  /* static members */
  @js.native
  object VoiceCommandDefinitionManager extends js.Object {
    
    /**
      * Installs the CommandSet elements in a Voice Command Definition (VCD) file.
      * @param file An object representing a VCD file.
      * @return An asynchronous handler called when the operation is complete.
      */
    def installCommandDefinitionsFromStorageFileAsync(file: StorageFile): IPromiseWithIAsyncAction = js.native
    
    /** A dictionary that contains all installed command sets that have a Name attribute set in the Voice Command Definition (VCD) file. */
    var installedCommandDefinitions: IMapView[
        String, 
        typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition
      ] = js.native
  }
  
  /** The result obtained from the disambiguation screen displayed on the Cortana canvas. */
  @js.native
  abstract class VoiceCommandDisambiguationResult ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandDisambiguationResult
  
  /** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
  @js.native
  abstract class VoiceCommandResponse ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse
  /* static members */
  @js.native
  object VoiceCommandResponse extends js.Object {
    
    /**
      * Creates a VoiceCommandResponse object used in calls to ReportProgressAsync , ReportSuccessAsync or ReportFailureAsync .
      * @param message The message that is spoken by Cortana and shown on the Cortana canvas.
      * @param contentTiles The collection of assets, containing image and text data, shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    def createResponse(
      message: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      contentTiles: IIterable[
          typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile
        ]
    ): typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    /**
      * Creates a VoiceCommandResponse object used in calls to ReportProgressAsync , ReportSuccessAsync or ReportFailureAsync .
      * @param userMessage The message that is spoken by Cortana and shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    def createResponse(userMessage: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage): typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    
    /**
      * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
      * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
      * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    def createResponseForPrompt(
      message: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      repeatMessage: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage
    ): typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    /**
      * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
      * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
      * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
      * @param contentTiles The collection of assets, containing image and text data, shown on the Cortana canvas.
      * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
      */
    def createResponseForPrompt(
      message: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      repeatMessage: typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage,
      contentTiles: IIterable[
          typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTile
        ]
    ): typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse = js.native
    
    /** Gets the maximum number of content tiles the background app service can display on the Cortana canvas. */
    var maxSupportedVoiceCommandContentTiles: Double = js.native
  }
  
  /** The background app service connection to Cortana. */
  @js.native
  abstract class VoiceCommandServiceConnection ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection
  /* static members */
  @js.native
  object VoiceCommandServiceConnection extends js.Object {
    
    /**
      * Retrieves a VoiceCommandServiceConnection object from the AppServiceTriggerDetails that contains info associated with the background task for the app service.
      * @param triggerDetails Contains info associated with the background task for the app service.
      * @return The background app service connection to Cortana.
      */
    def fromAppServiceTriggerDetails(triggerDetails: AppServiceTriggerDetails): typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection = js.native
  }
  
  /** The message that is spoken by Cortana and shown on the Cortana canvas. */
  @js.native
  /** Creates an instance of the VoiceCommandUserMessage class. */
  class VoiceCommandUserMessage ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage
}
