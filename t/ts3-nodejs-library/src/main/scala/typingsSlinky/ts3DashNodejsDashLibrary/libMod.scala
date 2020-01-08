package typingsSlinky.ts3DashNodejsDashLibrary

import typingsSlinky.std.Partial
import typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.ConnectionParams
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponse
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelGroupList
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelList
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientList
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.QueryErrorMessage
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerGroupList
import typingsSlinky.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class ResponseError protected ()
    extends typingsSlinky.ts3DashNodejsDashLibrary.libExceptionResponseErrorMod.ResponseError {
    def this(error: QueryErrorMessage) = this()
  }
  
  @js.native
  class TeamSpeak protected ()
    extends typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak {
    def this(config: Partial[ConnectionParams]) = this()
  }
  
  @js.native
  class TeamSpeakChannel protected ()
    extends typingsSlinky.ts3DashNodejsDashLibrary.libNodeChannelMod.TeamSpeakChannel {
    def this(parent: typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak, list: ChannelList) = this()
  }
  
  @js.native
  class TeamSpeakChannelGroup protected ()
    extends typingsSlinky.ts3DashNodejsDashLibrary.libNodeChannelGroupMod.TeamSpeakChannelGroup {
    def this(parent: typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak, list: ChannelGroupList) = this()
  }
  
  @js.native
  class TeamSpeakClient protected ()
    extends typingsSlinky.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient {
    def this(parent: typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak, list: ClientList) = this()
  }
  
  @js.native
  class TeamSpeakServer protected ()
    extends typingsSlinky.ts3DashNodejsDashLibrary.libNodeServerMod.TeamSpeakServer {
    def this(parent: typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak, list: ServerList) = this()
  }
  
  @js.native
  class TeamSpeakServerGroup protected ()
    extends typingsSlinky.ts3DashNodejsDashLibrary.libNodeServerGroupMod.TeamSpeakServerGroup {
    def this(parent: typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak, list: ServerGroupList) = this()
  }
  
  @js.native
  object ClientType extends js.Object {
    /* 0 */ val Regular: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType.Regular with Double = js.native
    /* 1 */ val ServerQuery: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType.ServerQuery with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType with Double] = js.native
  }
  
  @js.native
  object Codec extends js.Object {
    /* 3 */ val CELT_MONO: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.CELT_MONO with Double = js.native
    /* 0 */ val SPEEX_NARROWBAND: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.SPEEX_NARROWBAND with Double = js.native
    /* 2 */ val SPEEX_ULTRAWIDEBAND: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.SPEEX_ULTRAWIDEBAND with Double = js.native
    /* 1 */ val SPEEX_WIDEBAND: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.SPEEX_WIDEBAND with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec with Double] = js.native
  }
  
  @js.native
  object CodecEncryptionMode extends js.Object {
    /* 1 */ val DISABLED: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode.DISABLED with Double = js.native
    /* 2 */ val ENABLED: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode.ENABLED with Double = js.native
    /* 0 */ val INDIVIDUAL: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode.INDIVIDUAL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode with Double
      ] = js.native
  }
  
  @js.native
  object HostBannerMode extends js.Object {
    /* 1 */ val IGNOREASPECT: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode.IGNOREASPECT with Double = js.native
    /* 2 */ val KEEPASPECT: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode.KEEPASPECT with Double = js.native
    /* 0 */ val NOADJUST: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode.NOADJUST with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode with Double
      ] = js.native
  }
  
  @js.native
  object HostMessageMode extends js.Object {
    /* 1 */ val LOG: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.LOG with Double = js.native
    /* 2 */ val MODAL: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.MODAL with Double = js.native
    /* 3 */ val MODALQUIT: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.MODALQUIT with Double = js.native
    /* 0 */ val NONE: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode with Double
      ] = js.native
  }
  
  @js.native
  object LogLevel extends js.Object {
    /* 3 */ val DEBUG: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.DEBUG with Double = js.native
    /* 1 */ val ERROR: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.ERROR with Double = js.native
    /* 4 */ val INFO: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.INFO with Double = js.native
    /* 2 */ val WARNING: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel.WARNING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel with Double] = js.native
  }
  
  @js.native
  object PermissionGroupDatabaseTypes extends js.Object {
    /* 2 */ val Query: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Query with Double = js.native
    /* 1 */ val Regular: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Regular with Double = js.native
    /* 0 */ val Template: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Template with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes with Double
      ] = js.native
  }
  
  @js.native
  object PermissionGroupTypes extends js.Object {
    /* 2 */ val Channel: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.Channel with Double = js.native
    /* 4 */ val ChannelClient: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelClient with Double = js.native
    /* 3 */ val ChannelGroup: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelGroup with Double = js.native
    /* 1 */ val GlobalClient: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.GlobalClient with Double = js.native
    /* 0 */ val ServerGroup: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ServerGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes with Double
      ] = js.native
  }
  
  @js.native
  object QueryProtocol extends js.Object {
    /* "raw" */ val RAW: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.QueryProtocol.RAW with String = js.native
    /* "ssh" */ val SSH: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.QueryProtocol.SSH with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.QueryProtocol with String] = js.native
  }
  
  @js.native
  object ReasonIdentifier extends js.Object {
    /* 4 */ val KICK_CHANNEL: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier.KICK_CHANNEL with Double = js.native
    /* 5 */ val KICK_SERVER: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier.KICK_SERVER with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object TeamSpeak extends js.Object {
    /**
      * connects via a Promise wrapper
      * @param config config options to connect
      */
    def connect(config: Partial[ConnectionParams]): js.Promise[typingsSlinky.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak] = js.native
    /**
      * filters an array with given filter
      * @param array the array which should get filtered
      * @param filter filter object
      */
    def filter[T /* <: QueryResponse */](array: js.Array[T], filter: T): js.Array[T] = js.native
    /**
      * retrieves the first element of an array
      * @param input the response input
      */
    def singleResponse[T](input: T): T = js.native
    def singleResponse[T](input: js.Array[T]): T = js.native
    /**
      * Transforms an Input to an Array
      * @param input input data which should be converted to an array
      */
    def toArray[T](input: T): js.Array[T] = js.native
    def toArray[T](input: js.Array[T]): js.Array[T] = js.native
    /**
      * waits a set time of ms
      * @param time time in ms to wait
      */
    def wait(time: Double): js.Promise[_] = js.native
  }
  
  @js.native
  object TextMessageTargetMode extends js.Object {
    /* 2 */ val CHANNEL: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode.CHANNEL with Double = js.native
    /* 1 */ val CLIENT: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode.CLIENT with Double = js.native
    /* 3 */ val SERVER: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode.SERVER with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode with Double
      ] = js.native
  }
  
  @js.native
  object TokenType extends js.Object {
    /* 1 */ val ChannelGroup: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType.ChannelGroup with Double = js.native
    /* 0 */ val ServerGroup: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType.ServerGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType with Double] = js.native
  }
  
}

