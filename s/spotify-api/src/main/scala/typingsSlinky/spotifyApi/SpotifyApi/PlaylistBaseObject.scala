package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.playlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base Playlist Object. Does not in itself exist in Spotify Web Api,
  * but needs to be made since the tracks types vary in the Full and Simplified versions.
  */
@js.native
trait PlaylistBaseObject extends ContextObject {
  
  /**
    * Returns `true` if context is not search and the owner allows other users to modify the playlist.
    * Otherwise returns `false`.
    */
  var collaborative: Boolean = js.native
  
  /**
    * The playlist description. Only returned for modified, verified playlists, otherwise null.
    */
  var description: String | Null = js.native
  
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the playlist.
    */
  var id: String = js.native
  
  /**
    * Images for the playlist. The array may be empty or contain up to three images.
    * The images are returned by size in descending order.
    * See [Working with Playlists](https://developer.spotify.com/documentation/general/guides/working-with-playlists/).
    * Note: If returned, the source URL for the image (`url`) is temporary and will expire in less than a day.
    */
  var images: js.Array[ImageObject] = js.native
  
  /**
    * The name of the playlist.
    */
  var name: String = js.native
  
  /**
    * The user who owns the playlist.
    */
  var owner: UserObjectPublic = js.native
  
  /**
    * The playlist’s public/private status:
    * `true` the playlist is public,
    * `false` the playlist is private,
    * or `null` the playlist status is not relevant.
    */
  var public: Boolean | Null = js.native
  
  /**
    * The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version:
    * see [Remove tracks from a playlist](https://developer.spotify.com/documentation/web-api/reference/playlists/remove-tracks-playlist/).
    */
  var snapshot_id: String = js.native
  
  @JSName("type")
  var type_PlaylistBaseObject: playlist = js.native
}
object PlaylistBaseObject {
  
  @scala.inline
  def apply(
    collaborative: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    owner: UserObjectPublic,
    snapshot_id: String,
    `type`: playlist,
    uri: String
  ): PlaylistBaseObject = {
    val __obj = js.Dynamic.literal(collaborative = collaborative.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistBaseObject]
  }
  
  @scala.inline
  implicit class PlaylistBaseObjectMutableBuilder[Self <: PlaylistBaseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollaborative(value: Boolean): Self = StObject.set(x, "collaborative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: UserObjectPublic): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicNull: Self = StObject.set(x, "public", null)
    
    @scala.inline
    def setSnapshot_id(value: String): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: playlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
