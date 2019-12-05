package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EServerType extends js.Object

@JSImport("steam-client", "EServerType")
@js.native
object EServerType extends js.Object {
  @js.native
  sealed trait ACS extends EServerType
  
  @js.native
  sealed trait AM extends EServerType
  
   // removed
  @js.native
  sealed trait ASBOBSOLETE extends EServerType
  
  @js.native
  sealed trait ATS extends EServerType
  
  @js.native
  sealed trait AccountScore extends EServerType
  
  @js.native
  sealed trait AppInformation extends EServerType
  
  @js.native
  sealed trait Auth extends EServerType
  
  @js.native
  sealed trait BRP extends EServerType
  
  @js.native
  sealed trait BS extends EServerType
  
   // removed
  @js.native
  sealed trait BUM extends EServerType
  
   // removed
  @js.native
  sealed trait BUMOBOSOLETE extends EServerType
  
  @js.native
  sealed trait Backpack extends EServerType
  
   // removed,
  @js.native
  sealed trait BootstrapOBSOLETE extends EServerType
  
  @js.native
  sealed trait BoxMonitor extends EServerType
  
  @js.native
  sealed trait BroadcastChat extends EServerType
  
  @js.native
  sealed trait BroadcastDirectory extends EServerType
  
  @js.native
  sealed trait BroadcastRelay extends EServerType
  
  @js.native
  sealed trait CCS extends EServerType
  
  @js.native
  sealed trait CM extends EServerType
  
  @js.native
  sealed trait CRE extends EServerType
  
  @js.native
  sealed trait CS extends EServerType
  
  @js.native
  sealed trait Client extends EServerType
  
  @js.native
  sealed trait Community extends EServerType
  
  @js.native
  sealed trait Console extends EServerType
  
  @js.native
  sealed trait DFS extends EServerType
  
  @js.native
  sealed trait DP extends EServerType
  
  @js.native
  sealed trait DRMS extends EServerType
  
   // removed "renamed to Community"
  @js.native
  sealed trait DSS extends EServerType
  
  @js.native
  sealed trait DepotWebContent extends EServerType
  
   // removed
  @js.native
  sealed trait EPM extends EServerType
  
   // removed
  @js.native
  sealed trait EPMOBSOLETE extends EServerType
  
  @js.native
  sealed trait ES extends EServerType
  
  @js.native
  sealed trait Econ extends EServerType
  
  @js.native
  sealed trait EmailDelivery extends EServerType
  
  @js.native
  sealed trait ExternalConfig extends EServerType
  
  @js.native
  sealed trait ExternalMonitor extends EServerType
  
  @js.native
  sealed trait FBS extends EServerType
  
   // removed "renamed to BoxMonitor"
  @js.native
  sealed trait FG extends EServerType
  
  @js.native
  sealed trait FS extends EServerType
  
  @js.native
  sealed trait FTS extends EServerType
  
  @js.native
  sealed trait First extends EServerType
  
  @js.native
  sealed trait GC extends EServerType
  
  @js.native
  sealed trait GCH extends EServerType
  
  @js.native
  sealed trait GM extends EServerType
  
  @js.native
  sealed trait GMS extends EServerType
  
  @js.native
  sealed trait GameNotifications extends EServerType
  
  @js.native
  sealed trait HLTVRelay extends EServerType
  
   // removed
  @js.native
  sealed trait HubOBSOLETE extends EServerType
  
  @js.native
  sealed trait IS extends EServerType
  
  @js.native
  sealed trait Invalid extends EServerType
  
  @js.native
  sealed trait InventoryManagement extends EServerType
  
  @js.native
  sealed trait KGS extends EServerType
  
  @js.native
  sealed trait LBS extends EServerType
  
  @js.native
  sealed trait Localization extends EServerType
  
  @js.native
  sealed trait LogRequest extends EServerType
  
  @js.native
  sealed trait LogWorker extends EServerType
  
  @js.native
  sealed trait Logsink extends EServerType
  
  @js.native
  sealed trait MDS extends EServerType
  
  @js.native
  sealed trait MMS extends EServerType
  
  @js.native
  sealed trait MPAS extends EServerType
  
  @js.native
  sealed trait Market extends EServerType
  
  @js.native
  sealed trait MarketRepl extends EServerType
  
  @js.native
  sealed trait MarketSearch extends EServerType
  
  @js.native
  sealed trait Max extends EServerType
  
  @js.native
  sealed trait MoneyStats extends EServerType
  
  @js.native
  sealed trait NS extends EServerType
  
  @js.native
  sealed trait OGS extends EServerType
  
   // removed
  @js.native
  sealed trait P2PRelayOBSOLETE extends EServerType
  
  @js.native
  sealed trait PICS extends EServerType
  
  @js.native
  sealed trait PNP extends EServerType
  
  @js.native
  sealed trait PS extends EServerType
  
  @js.native
  sealed trait Parental extends EServerType
  
  @js.native
  sealed trait Partner extends EServerType
  
  @js.native
  sealed trait PartnerUpload extends EServerType
  
  @js.native
  sealed trait Phone extends EServerType
  
  @js.native
  sealed trait PublicTest extends EServerType
  
  @js.native
  sealed trait Quest extends EServerType
  
  @js.native
  sealed trait RM extends EServerType
  
  @js.native
  sealed trait SLC extends EServerType
  
  @js.native
  sealed trait SM extends EServerType
  
  @js.native
  sealed trait SS extends EServerType
  
  @js.native
  sealed trait Secrets extends EServerType
  
  @js.native
  sealed trait Shell extends EServerType
  
  @js.native
  sealed trait SolrMgr extends EServerType
  
  @js.native
  sealed trait Spare extends EServerType
  
  @js.native
  sealed trait Steam2Emulator extends EServerType
  
   // removed "renamed to StoreFeature"
  @js.native
  sealed trait Store extends EServerType
  
  @js.native
  sealed trait StoreCatalog extends EServerType
  
  @js.native
  sealed trait StoreFeature extends EServerType
  
  @js.native
  sealed trait Support extends EServerType
  
  @js.native
  sealed trait TaxForm extends EServerType
  
  @js.native
  sealed trait Trade extends EServerType
  
  @js.native
  sealed trait TradeOffer extends EServerType
  
  @js.native
  sealed trait UCM extends EServerType
  
  @js.native
  sealed trait UDS extends EServerType
  
  @js.native
  sealed trait UFS extends EServerType
  
  @js.native
  sealed trait UGS extends EServerType
  
  @js.native
  sealed trait UMQ extends EServerType
  
  @js.native
  sealed trait Util extends EServerType
  
  @js.native
  sealed trait VS extends EServerType
  
  @js.native
  sealed trait VideoManager extends EServerType
  
  @js.native
  sealed trait WDS extends EServerType
  
  @js.native
  sealed trait WG extends EServerType
  
  @js.native
  sealed trait WebAPI extends EServerType
  
  @js.native
  sealed trait Workshop extends EServerType
  
  /* 65 */ val ACS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.ACS with Double = js.native
  /* 3 */ val AM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.AM with Double = js.native
  /* 14 */ val ASBOBSOLETE: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.ASBOBSOLETE with Double = js.native
  /* 6 */ val ATS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.ATS with Double = js.native
  /* 88 */ val AccountScore: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.AccountScore with Double = js.native
  /* 26 */ val AppInformation: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.AppInformation with Double = js.native
  /* 94 */ val Auth: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Auth with Double = js.native
  /* 56 */ val BRP: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BRP with Double = js.native
  /* 4 */ val BS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BS with Double = js.native
  /* 2 */ val BUM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BUM with Double = js.native
  /* 2 */ val BUMOBOSOLETE: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BUMOBOSOLETE with Double = js.native
  /* 49 */ val Backpack: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Backpack with Double = js.native
  /* 16 */ val BootstrapOBSOLETE: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BootstrapOBSOLETE with Double = js.native
  /* 9 */ val BoxMonitor: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BoxMonitor with Double = js.native
  /* 86 */ val BroadcastChat: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BroadcastChat with Double = js.native
  /* 83 */ val BroadcastDirectory: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BroadcastDirectory with Double = js.native
  /* 82 */ val BroadcastRelay: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.BroadcastRelay with Double = js.native
  /* 32 */ val CCS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.CCS with Double = js.native
  /* 7 */ val CM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.CM with Double = js.native
  /* 53 */ val CRE: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.CRE with Double = js.native
  /* 36 */ val CS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.CS with Double = js.native
  /* 15 */ val Client: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Client with Double = js.native
  /* 24 */ val Community: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Community with Double = js.native
  /* 13 */ val Console: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Console with Double = js.native
  /* 33 */ val DFS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.DFS with Double = js.native
  /* 17 */ val DP: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.DP with Double = js.native
  /* 11 */ val DRMS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.DRMS with Double = js.native
  /* 24 */ val DSS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.DSS with Double = js.native
  /* 73 */ val DepotWebContent: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.DepotWebContent with Double = js.native
  /* 29 */ val EPM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.EPM with Double = js.native
  /* 29 */ val EPMOBSOLETE: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.EPMOBSOLETE with Double = js.native
  /* 72 */ val ES: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.ES with Double = js.native
  /* 48 */ val Econ: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Econ with Double = js.native
  /* 92 */ val EmailDelivery: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.EmailDelivery with Double = js.native
  /* 74 */ val ExternalConfig: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.ExternalConfig with Double = js.native
  /* 68 */ val ExternalMonitor: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.ExternalMonitor with Double = js.native
  /* 8 */ val FBS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.FBS with Double = js.native
  /* 9 */ val FG: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.FG with Double = js.native
  /* 47 */ val FS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.FS with Double = js.native
  /* 28 */ val FTS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.FTS with Double = js.native
  /* 0 */ val First: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.First with Double = js.native
  /* 37 */ val GC: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.GC with Double = js.native
  /* 57 */ val GCH: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.GCH with Double = js.native
  /* 1 */ val GM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.GM with Double = js.native
  /* 43 */ val GMS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.GMS with Double = js.native
  /* 75 */ val GameNotifications: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.GameNotifications with Double = js.native
  /* 96 */ val HLTVRelay: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.HLTVRelay with Double = js.native
  /* 12 */ val HubOBSOLETE: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.HubOBSOLETE with Double = js.native
  /* 31 */ val IS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.IS with Double = js.native
  /* -1 */ val Invalid: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Invalid with Double = js.native
  /* 93 */ val InventoryManagement: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.InventoryManagement with Double = js.native
  /* 44 */ val KGS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.KGS with Double = js.native
  /* 34 */ val LBS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.LBS with Double = js.native
  /* 78 */ val Localization: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Localization with Double = js.native
  /* 90 */ val LogRequest: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.LogRequest with Double = js.native
  /* 91 */ val LogWorker: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.LogWorker with Double = js.native
  /* 61 */ val Logsink: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Logsink with Double = js.native
  /* 35 */ val MDS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.MDS with Double = js.native
  /* 42 */ val MMS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.MMS with Double = js.native
  /* 58 */ val MPAS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.MPAS with Double = js.native
  /* 62 */ val Market: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Market with Double = js.native
  /* 76 */ val MarketRepl: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.MarketRepl with Double = js.native
  /* 77 */ val MarketSearch: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.MarketSearch with Double = js.native
  /* 97 */ val Max: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Max with Double = js.native
  /* 52 */ val MoneyStats: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.MoneyStats with Double = js.native
  /* 38 */ val NS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.NS with Double = js.native
  /* 39 */ val OGS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.OGS with Double = js.native
  /* 25 */ val P2PRelayOBSOLETE: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.P2PRelayOBSOLETE with Double = js.native
  /* 14 */ val PICS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.PICS with Double = js.native
  /* 66 */ val PNP: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.PNP with Double = js.native
  /* 30 */ val PS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.PS with Double = js.native
  /* 69 */ val Parental: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Parental with Double = js.native
  /* 71 */ val Partner: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Partner with Double = js.native
  /* 70 */ val PartnerUpload: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.PartnerUpload with Double = js.native
  /* 87 */ val Phone: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Phone with Double = js.native
  /* 80 */ val PublicTest: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.PublicTest with Double = js.native
  /* 63 */ val Quest: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Quest with Double = js.native
  /* 46 */ val RM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.RM with Double = js.native
  /* 20 */ val SLC: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.SLC with Double = js.native
  /* 19 */ val SM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.SM with Double = js.native
  /* 10 */ val SS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.SS with Double = js.native
  /* 60 */ val Secrets: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Secrets with Double = js.native
  /* 0 */ val Shell: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Shell with Double = js.native
  /* 81 */ val SolrMgr: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.SolrMgr with Double = js.native
  /* 27 */ val Spare: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Spare with Double = js.native
  /* 79 */ val Steam2Emulator: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Steam2Emulator with Double = js.native
  /* 51 */ val Store: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Store with Double = js.native
  /* 95 */ val StoreCatalog: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.StoreCatalog with Double = js.native
  /* 51 */ val StoreFeature: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.StoreFeature with Double = js.native
  /* 89 */ val Support: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Support with Double = js.native
  /* 67 */ val TaxForm: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.TaxForm with Double = js.native
  /* 59 */ val Trade: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Trade with Double = js.native
  /* 85 */ val TradeOffer: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.TradeOffer with Double = js.native
  /* 45 */ val UCM: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.UCM with Double = js.native
  /* 41 */ val UDS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.UDS with Double = js.native
  /* 21 */ val UFS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.UFS with Double = js.native
  /* 50 */ val UGS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.UGS with Double = js.native
  /* 54 */ val UMQ: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.UMQ with Double = js.native
  /* 23 */ val Util: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Util with Double = js.native
  /* 5 */ val VS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.VS with Double = js.native
  /* 84 */ val VideoManager: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.VideoManager with Double = js.native
  /* 64 */ val WDS: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.WDS with Double = js.native
  /* 18 */ val WG: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.WG with Double = js.native
  /* 40 */ val WebAPI: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.WebAPI with Double = js.native
  /* 55 */ val Workshop: typingsSlinky.steamDashClient.steamDashClientMod.EServerType.Workshop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerType with Double] = js.native
}

