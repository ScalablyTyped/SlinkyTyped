package typingsSlinky.ts3NodejsLibrary

import typingsSlinky.node.Buffer
import typingsSlinky.ts3NodejsLibrary.abstractMod.Abstract
import typingsSlinky.ts3NodejsLibrary.anon.Cgid
import typingsSlinky.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typingsSlinky.ts3NodejsLibrary.permissionMod.Permission
import typingsSlinky.ts3NodejsLibrary.permissionMod.Permission.PermType
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.ChannelGroupClientList
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.ChannelGroupCopy
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.ChannelGroupEntry
import typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelGroupMod {
  
  @JSImport("ts3-nodejs-library/lib/node/ChannelGroup", "TeamSpeakChannelGroup")
  @js.native
  class TeamSpeakChannelGroup protected () extends Abstract[ChannelGroupEntry] {
    def this(parent: TeamSpeak, list: ChannelGroupEntry) = this()
    
    /**
      * Adds a specified permissions to the channel group.
      * A permission can be specified by permid or permsid.
      * @param perm the permission object
      */
    def addPerm(perm: PermType): js.Promise[js.Array[js.Any]] = js.native
    
    def cgid: String = js.native
    
    /**
      * returns the ids of all clients currently residing in the channelgroup
      * @param channel the channel id
      */
    def clientList(channel: String): js.Promise[ChannelGroupClientList] = js.native
    def clientList(channel: TeamSpeakChannel): js.Promise[ChannelGroupClientList] = js.native
    
    /**
      * Creates a copy of the channel group. If tcgid is set to 0, the server will create a new group.
      * To overwrite an existing group, simply set tcgid to the ID of a designated target group.
      * If a target group is set, the name parameter will be ignored.
      * @param tcgid the target group, 0 to create a new group
      * @param type the type of the group (0 = Template Group | 1 = Normal Group)
      * @param name name of the group
      */
    def copy(tcgid: String, `type`: Double, name: String): js.Promise[ChannelGroupCopy] = js.native
    def copy(tcgid: TeamSpeakChannelGroup, `type`: Double, name: String): js.Promise[ChannelGroupCopy] = js.native
    
    /**
      * Adds a specified permissions to the channel group.
      * A permission can be specified by permid or permsid.
      */
    def createPerm(): Permission[_] = js.native
    
    /**
      * Deletes the channel group. If force is set to 1, the channel group will be deleted even if there are clients within.
      * @param force if set to 1 the channelgroup will be deleted even when clients are in it
      */
    def del(): js.Promise[js.Array[js.Any]] = js.native
    def del(force: Boolean): js.Promise[js.Array[js.Any]] = js.native
    
    /**
      * Removes a set of specified permissions from the channel group.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[js.Any]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[js.Any]] = js.native
    
    /** returns a buffer with the icon of the channelgroup */
    def getIcon(): js.Promise[Buffer] = js.native
    
    /** gets the icon name of the channelgroup */
    def getIconId(): js.Promise[Double] = js.native
    
    def iconid: String = js.native
    
    def nMemberAddp: Double = js.native
    
    def nMemberRemovep: Double = js.native
    
    def nModifyp: Double = js.native
    
    def name: String = js.native
    
    def namemode: Double = js.native
    
    /**
      * returns a list of permissions assigned to the channel group specified with cgid.
      * @param permsid if the permsid option is set to true the output will contain the permission names
      */
    def permList(): js.Promise[js.Array[Permission[Cgid]]] = js.native
    def permList(permsid: Boolean): js.Promise[js.Array[Permission[Cgid]]] = js.native
    
    /**
      * changes the name of the channelgroup
      * @param name new name of the group
      */
    def rename(name: String): js.Promise[js.Array[js.Any]] = js.native
    
    def savedb: Double = js.native
    
    /**
      * sets the channel group of a client
      * @param channel the channel in which the client should be assigned the Group
      * @param client the client database id which should be added to the Group
      */
    def setClient(channel: String, client: String): js.Promise[js.Array[js.Any]] = js.native
    def setClient(channel: String, client: TeamSpeakClient): js.Promise[js.Array[js.Any]] = js.native
    def setClient(channel: TeamSpeakChannel, client: String): js.Promise[js.Array[js.Any]] = js.native
    def setClient(channel: TeamSpeakChannel, client: TeamSpeakClient): js.Promise[js.Array[js.Any]] = js.native
    
    def sortid: Double = js.native
    
    def `type`: Double = js.native
  }
  /* static members */
  object TeamSpeakChannelGroup {
    
    /** retrieves the client id from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib/node/ChannelGroup", "TeamSpeakChannelGroup.getId")
    @js.native
    def getId[T /* <: GroupType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib/node/ChannelGroup", "TeamSpeakChannelGroup.getId")
    @js.native
    def getId[T /* <: GroupType */](channel: T): js.UndefOr[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib/node/ChannelGroup", "TeamSpeakChannelGroup.getMultipleIds")
    @js.native
    def getMultipleIds(client: MultiGroupType): js.Array[String] = js.native
    
    type GroupType = String | TeamSpeakChannelGroup
    
    type MultiGroupType = (js.Array[String | TeamSpeakChannelGroup]) | GroupType
  }
}
