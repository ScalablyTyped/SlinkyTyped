package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Web.Http.HttpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Streaming {
  
  /** Provides the ability to playback multimedia content that is delivered using various adaptive streaming protocols. You can playback Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content. */
  object Adaptive {
    
    /** Represents the source of adaptive streaming content. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource")
    @js.native
    abstract class AdaptiveMediaSource ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
    object AdaptiveMediaSource {
      
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
        * @param stream The input stream from which the AdaptiveMediaSource is created.
        * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
        * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource.createFromStreamAsync")
      @js.native
      def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String): IPromiseWithIAsyncOperation[
            typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the provided input stream.
        * @param stream The input stream from which the AdaptiveMediaSource is created.
        * @param uri The URI of the source. This is used by the AdaptiveMediaSource to resolve relative URIs.
        * @param contentType A string that identifies the MIME content type of the source. This can be an Http Live Streaming (HLS) or a Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource.createFromStreamAsync")
      @js.native
      def createFromStreamAsync(stream: IInputStream, uri: Uri, contentType: String, httpClient: HttpClient): IPromiseWithIAsyncOperation[
            typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
        * @param uri The URI of the source.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource.createFromUriAsync")
      @js.native
      def createFromUriAsync(uri: Uri): IPromiseWithIAsyncOperation[
            typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      /**
        * Asynchronously creates a AdaptiveMediaSource object from the Uniform Resource Identifier (URI) of the source.
        * @param uri The URI of the source.
        * @param httpClient The HttpClient instance that the AdaptiveMediaSource should use for downloading resources. This allows you to specify custom HTTP headers for the requests.
        * @return Returns an AdaptiveMediaSourceCreationResult upon successful completion.
        */
      /* static member */
      @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource.createFromUriAsync")
      @js.native
      def createFromUriAsync(uri: Uri, httpClient: HttpClient): IPromiseWithIAsyncOperation[
            typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
          ] = js.native
      
      /**
        * Determines whether the content type of the source is supported.
        * @param contentType A string that identifies the content type of the source. Can be a Http Live Streaming (HLS) or Dynamic Adaptive Streaming over HTTP (DASH) content type.
        * @return Returns a value that indicates whether the content type of the source is supported. true if supported; otherwise, false.
        */
      /* static member */
      @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource.isContentTypeSupported")
      @js.native
      def isContentTypeSupported(contentType: String): Boolean = js.native
    }
    
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceAdvancedSettings")
    @js.native
    abstract class AdaptiveMediaSourceAdvancedSettings ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceAdvancedSettings
    
    /** Represents the result of the creation of a AdaptiveMediaSource object. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult")
    @js.native
    abstract class AdaptiveMediaSourceCreationResult ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult
    
    /** Specifies the result of an attempt to create a AdaptiveMediaSource object. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus")
    @js.native
    object AdaptiveMediaSourceCreationStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus with Double
          ] = js.native
      
      /* 1 */ val manifestDownloadFailure: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.manifestDownloadFailure with Double = js.native
      
      /* 2 */ val manifestParseFailure: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.manifestParseFailure with Double = js.native
      
      /* 0 */ val success: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.success with Double = js.native
      
      /* 6 */ val unknownFailure: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unknownFailure with Double = js.native
      
      /* 3 */ val unsupportedManifestContentType: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestContentType with Double = js.native
      
      /* 5 */ val unsupportedManifestProfile: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestProfile with Double = js.native
      
      /* 4 */ val unsupportedManifestVersion: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus.unsupportedManifestVersion with Double = js.native
    }
    
    /** Provides data for the DownloadBitrateChanged event. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedEventArgs")
    @js.native
    abstract class AdaptiveMediaSourceDownloadBitrateChangedEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedEventArgs
    
    /** Provides data for the DownloadCompleted event. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadCompletedEventArgs")
    @js.native
    abstract class AdaptiveMediaSourceDownloadCompletedEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadCompletedEventArgs
    
    /** Provides data for the DownloadFailed event. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadFailedEventArgs")
    @js.native
    abstract class AdaptiveMediaSourceDownloadFailedEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadFailedEventArgs
    
    /** Represents a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral")
    @js.native
    abstract class AdaptiveMediaSourceDownloadRequestedDeferral ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral
    
    /** Provides data for the DownloadRequested event. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedEventArgs")
    @js.native
    abstract class AdaptiveMediaSourceDownloadRequestedEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedEventArgs
    
    /** Represents the results of a resource download operation. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult")
    @js.native
    abstract class AdaptiveMediaSourceDownloadResult ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult
    
    /** Provides data for the PlaybackBitrateChanged event. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourcePlaybackBitrateChangedEventArgs")
    @js.native
    abstract class AdaptiveMediaSourcePlaybackBitrateChangedEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourcePlaybackBitrateChangedEventArgs
    
    /** Specifies the type of an adaptive media resource. */
    @JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType")
    @js.native
    object AdaptiveMediaSourceResourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType with Double
          ] = js.native
      
      /* 1 */ val initializationSegment: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.initializationSegment with Double = js.native
      
      /* 4 */ val initializationVector: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.initializationVector with Double = js.native
      
      /* 3 */ val key: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.key with Double = js.native
      
      /* 0 */ val manifest: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.manifest with Double = js.native
      
      /* 2 */ val mediaSegment: typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType.mediaSegment with Double = js.native
    }
  }
}
