// Log wrapper class for Sun private system exceptions in group NAMING
//
// Generated by MC.java version 1.0, DO NOT EDIT BY HAND!
// Generated from input file ../../../../src/share/classes/com/sun/corba/se/spi/logging/data/Naming.mc on Mon Jun 27 02:17:04 PDT 2011

package com.sun.corba.se.impl.logging ;

import java.util.logging.Logger ;
import java.util.logging.Level ;

import org.omg.CORBA.OMGVMCID ;
import com.sun.corba.se.impl.util.SUNVMCID ;
import org.omg.CORBA.CompletionStatus ;
import org.omg.CORBA.SystemException ;

import com.sun.corba.se.spi.orb.ORB ;

import com.sun.corba.se.spi.logging.LogWrapperFactory;

import com.sun.corba.se.spi.logging.LogWrapperBase;

import org.omg.CORBA.BAD_PARAM ;
import org.omg.CORBA.UNKNOWN ;
import org.omg.CORBA.INITIALIZE ;
import org.omg.CORBA.INTERNAL ;

public class NamingSystemException extends LogWrapperBase {
    
    public NamingSystemException( Logger logger )
    {
        super( logger ) ;
    }
    
    private static LogWrapperFactory factory = new LogWrapperFactory() {
        public LogWrapperBase create( Logger logger )
        {
            return new NamingSystemException( logger ) ;
        }
    } ;
    
    public static NamingSystemException get( ORB orb, String logDomain )
    {
        NamingSystemException wrapper = 
            (NamingSystemException) orb.getLogWrapper( logDomain, 
                "NAMING", factory ) ;
        return wrapper ;
    } 
    
    public static NamingSystemException get( String logDomain )
    {
        NamingSystemException wrapper = 
            (NamingSystemException) ORB.staticGetLogWrapper( logDomain, 
                "NAMING", factory ) ;
        return wrapper ;
    } 
    
    ///////////////////////////////////////////////////////////
    // BAD_PARAM
    ///////////////////////////////////////////////////////////
    
    public static final int TRANSIENT_NAME_SERVER_BAD_PORT = SUNVMCID.value + 600 ;
    
    public BAD_PARAM transientNameServerBadPort( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( TRANSIENT_NAME_SERVER_BAD_PORT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transientNameServerBadPort",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM transientNameServerBadPort( CompletionStatus cs ) {
        return transientNameServerBadPort( cs, null  ) ;
    }
    
    public BAD_PARAM transientNameServerBadPort( Throwable t ) {
        return transientNameServerBadPort( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM transientNameServerBadPort(  ) {
        return transientNameServerBadPort( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int TRANSIENT_NAME_SERVER_BAD_HOST = SUNVMCID.value + 601 ;
    
    public BAD_PARAM transientNameServerBadHost( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( TRANSIENT_NAME_SERVER_BAD_HOST, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transientNameServerBadHost",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM transientNameServerBadHost( CompletionStatus cs ) {
        return transientNameServerBadHost( cs, null  ) ;
    }
    
    public BAD_PARAM transientNameServerBadHost( Throwable t ) {
        return transientNameServerBadHost( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM transientNameServerBadHost(  ) {
        return transientNameServerBadHost( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int OBJECT_IS_NULL = SUNVMCID.value + 602 ;
    
    public BAD_PARAM objectIsNull( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( OBJECT_IS_NULL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.objectIsNull",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM objectIsNull( CompletionStatus cs ) {
        return objectIsNull( cs, null  ) ;
    }
    
    public BAD_PARAM objectIsNull( Throwable t ) {
        return objectIsNull( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM objectIsNull(  ) {
        return objectIsNull( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int INS_BAD_ADDRESS = SUNVMCID.value + 603 ;
    
    public BAD_PARAM insBadAddress( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( INS_BAD_ADDRESS, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.insBadAddress",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM insBadAddress( CompletionStatus cs ) {
        return insBadAddress( cs, null  ) ;
    }
    
    public BAD_PARAM insBadAddress( Throwable t ) {
        return insBadAddress( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM insBadAddress(  ) {
        return insBadAddress( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // UNKNOWN
    ///////////////////////////////////////////////////////////
    
    public static final int BIND_UPDATE_CONTEXT_FAILED = SUNVMCID.value + 600 ;
    
    public UNKNOWN bindUpdateContextFailed( CompletionStatus cs, Throwable t ) {
        UNKNOWN exc = new UNKNOWN( BIND_UPDATE_CONTEXT_FAILED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.bindUpdateContextFailed",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public UNKNOWN bindUpdateContextFailed( CompletionStatus cs ) {
        return bindUpdateContextFailed( cs, null  ) ;
    }
    
    public UNKNOWN bindUpdateContextFailed( Throwable t ) {
        return bindUpdateContextFailed( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public UNKNOWN bindUpdateContextFailed(  ) {
        return bindUpdateContextFailed( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int BIND_FAILURE = SUNVMCID.value + 601 ;
    
    public UNKNOWN bindFailure( CompletionStatus cs, Throwable t ) {
        UNKNOWN exc = new UNKNOWN( BIND_FAILURE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.bindFailure",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public UNKNOWN bindFailure( CompletionStatus cs ) {
        return bindFailure( cs, null  ) ;
    }
    
    public UNKNOWN bindFailure( Throwable t ) {
        return bindFailure( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public UNKNOWN bindFailure(  ) {
        return bindFailure( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int RESOLVE_CONVERSION_FAILURE = SUNVMCID.value + 602 ;
    
    public UNKNOWN resolveConversionFailure( CompletionStatus cs, Throwable t ) {
        UNKNOWN exc = new UNKNOWN( RESOLVE_CONVERSION_FAILURE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.resolveConversionFailure",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public UNKNOWN resolveConversionFailure( CompletionStatus cs ) {
        return resolveConversionFailure( cs, null  ) ;
    }
    
    public UNKNOWN resolveConversionFailure( Throwable t ) {
        return resolveConversionFailure( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public UNKNOWN resolveConversionFailure(  ) {
        return resolveConversionFailure( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int RESOLVE_FAILURE = SUNVMCID.value + 603 ;
    
    public UNKNOWN resolveFailure( CompletionStatus cs, Throwable t ) {
        UNKNOWN exc = new UNKNOWN( RESOLVE_FAILURE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.resolveFailure",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public UNKNOWN resolveFailure( CompletionStatus cs ) {
        return resolveFailure( cs, null  ) ;
    }
    
    public UNKNOWN resolveFailure( Throwable t ) {
        return resolveFailure( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public UNKNOWN resolveFailure(  ) {
        return resolveFailure( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int UNBIND_FAILURE = SUNVMCID.value + 604 ;
    
    public UNKNOWN unbindFailure( CompletionStatus cs, Throwable t ) {
        UNKNOWN exc = new UNKNOWN( UNBIND_FAILURE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.unbindFailure",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public UNKNOWN unbindFailure( CompletionStatus cs ) {
        return unbindFailure( cs, null  ) ;
    }
    
    public UNKNOWN unbindFailure( Throwable t ) {
        return unbindFailure( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public UNKNOWN unbindFailure(  ) {
        return unbindFailure( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // INITIALIZE
    ///////////////////////////////////////////////////////////
    
    public static final int TRANS_NS_CANNOT_CREATE_INITIAL_NC_SYS = SUNVMCID.value + 650 ;
    
    public INITIALIZE transNsCannotCreateInitialNcSys( CompletionStatus cs, Throwable t ) {
        INITIALIZE exc = new INITIALIZE( TRANS_NS_CANNOT_CREATE_INITIAL_NC_SYS, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transNsCannotCreateInitialNcSys",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INITIALIZE transNsCannotCreateInitialNcSys( CompletionStatus cs ) {
        return transNsCannotCreateInitialNcSys( cs, null  ) ;
    }
    
    public INITIALIZE transNsCannotCreateInitialNcSys( Throwable t ) {
        return transNsCannotCreateInitialNcSys( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INITIALIZE transNsCannotCreateInitialNcSys(  ) {
        return transNsCannotCreateInitialNcSys( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int TRANS_NS_CANNOT_CREATE_INITIAL_NC = SUNVMCID.value + 651 ;
    
    public INITIALIZE transNsCannotCreateInitialNc( CompletionStatus cs, Throwable t ) {
        INITIALIZE exc = new INITIALIZE( TRANS_NS_CANNOT_CREATE_INITIAL_NC, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transNsCannotCreateInitialNc",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INITIALIZE transNsCannotCreateInitialNc( CompletionStatus cs ) {
        return transNsCannotCreateInitialNc( cs, null  ) ;
    }
    
    public INITIALIZE transNsCannotCreateInitialNc( Throwable t ) {
        return transNsCannotCreateInitialNc( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INITIALIZE transNsCannotCreateInitialNc(  ) {
        return transNsCannotCreateInitialNc( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // INTERNAL
    ///////////////////////////////////////////////////////////
    
    public static final int NAMING_CTX_REBIND_ALREADY_BOUND = SUNVMCID.value + 600 ;
    
    public INTERNAL namingCtxRebindAlreadyBound( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( NAMING_CTX_REBIND_ALREADY_BOUND, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.namingCtxRebindAlreadyBound",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL namingCtxRebindAlreadyBound( CompletionStatus cs ) {
        return namingCtxRebindAlreadyBound( cs, null  ) ;
    }
    
    public INTERNAL namingCtxRebindAlreadyBound( Throwable t ) {
        return namingCtxRebindAlreadyBound( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL namingCtxRebindAlreadyBound(  ) {
        return namingCtxRebindAlreadyBound( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int NAMING_CTX_REBINDCTX_ALREADY_BOUND = SUNVMCID.value + 601 ;
    
    public INTERNAL namingCtxRebindctxAlreadyBound( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( NAMING_CTX_REBINDCTX_ALREADY_BOUND, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.namingCtxRebindctxAlreadyBound",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL namingCtxRebindctxAlreadyBound( CompletionStatus cs ) {
        return namingCtxRebindctxAlreadyBound( cs, null  ) ;
    }
    
    public INTERNAL namingCtxRebindctxAlreadyBound( Throwable t ) {
        return namingCtxRebindctxAlreadyBound( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL namingCtxRebindctxAlreadyBound(  ) {
        return namingCtxRebindctxAlreadyBound( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int NAMING_CTX_BAD_BINDINGTYPE = SUNVMCID.value + 602 ;
    
    public INTERNAL namingCtxBadBindingtype( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( NAMING_CTX_BAD_BINDINGTYPE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.namingCtxBadBindingtype",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL namingCtxBadBindingtype( CompletionStatus cs ) {
        return namingCtxBadBindingtype( cs, null  ) ;
    }
    
    public INTERNAL namingCtxBadBindingtype( Throwable t ) {
        return namingCtxBadBindingtype( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL namingCtxBadBindingtype(  ) {
        return namingCtxBadBindingtype( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int NAMING_CTX_RESOLVE_CANNOT_NARROW_TO_CTX = SUNVMCID.value + 603 ;
    
    public INTERNAL namingCtxResolveCannotNarrowToCtx( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( NAMING_CTX_RESOLVE_CANNOT_NARROW_TO_CTX, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.namingCtxResolveCannotNarrowToCtx",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL namingCtxResolveCannotNarrowToCtx( CompletionStatus cs ) {
        return namingCtxResolveCannotNarrowToCtx( cs, null  ) ;
    }
    
    public INTERNAL namingCtxResolveCannotNarrowToCtx( Throwable t ) {
        return namingCtxResolveCannotNarrowToCtx( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL namingCtxResolveCannotNarrowToCtx(  ) {
        return namingCtxResolveCannotNarrowToCtx( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int NAMING_CTX_BINDING_ITERATOR_CREATE = SUNVMCID.value + 604 ;
    
    public INTERNAL namingCtxBindingIteratorCreate( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( NAMING_CTX_BINDING_ITERATOR_CREATE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.namingCtxBindingIteratorCreate",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL namingCtxBindingIteratorCreate( CompletionStatus cs ) {
        return namingCtxBindingIteratorCreate( cs, null  ) ;
    }
    
    public INTERNAL namingCtxBindingIteratorCreate( Throwable t ) {
        return namingCtxBindingIteratorCreate( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL namingCtxBindingIteratorCreate(  ) {
        return namingCtxBindingIteratorCreate( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int TRANS_NC_BIND_ALREADY_BOUND = SUNVMCID.value + 700 ;
    
    public INTERNAL transNcBindAlreadyBound( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( TRANS_NC_BIND_ALREADY_BOUND, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transNcBindAlreadyBound",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL transNcBindAlreadyBound( CompletionStatus cs ) {
        return transNcBindAlreadyBound( cs, null  ) ;
    }
    
    public INTERNAL transNcBindAlreadyBound( Throwable t ) {
        return transNcBindAlreadyBound( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL transNcBindAlreadyBound(  ) {
        return transNcBindAlreadyBound( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int TRANS_NC_LIST_GOT_EXC = SUNVMCID.value + 701 ;
    
    public INTERNAL transNcListGotExc( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( TRANS_NC_LIST_GOT_EXC, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transNcListGotExc",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL transNcListGotExc( CompletionStatus cs ) {
        return transNcListGotExc( cs, null  ) ;
    }
    
    public INTERNAL transNcListGotExc( Throwable t ) {
        return transNcListGotExc( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL transNcListGotExc(  ) {
        return transNcListGotExc( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int TRANS_NC_NEWCTX_GOT_EXC = SUNVMCID.value + 702 ;
    
    public INTERNAL transNcNewctxGotExc( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( TRANS_NC_NEWCTX_GOT_EXC, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transNcNewctxGotExc",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL transNcNewctxGotExc( CompletionStatus cs ) {
        return transNcNewctxGotExc( cs, null  ) ;
    }
    
    public INTERNAL transNcNewctxGotExc( Throwable t ) {
        return transNcNewctxGotExc( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL transNcNewctxGotExc(  ) {
        return transNcNewctxGotExc( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int TRANS_NC_DESTROY_GOT_EXC = SUNVMCID.value + 703 ;
    
    public INTERNAL transNcDestroyGotExc( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( TRANS_NC_DESTROY_GOT_EXC, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.transNcDestroyGotExc",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL transNcDestroyGotExc( CompletionStatus cs ) {
        return transNcDestroyGotExc( cs, null  ) ;
    }
    
    public INTERNAL transNcDestroyGotExc( Throwable t ) {
        return transNcDestroyGotExc( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL transNcDestroyGotExc(  ) {
        return transNcDestroyGotExc( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int INS_BAD_SCHEME_NAME = SUNVMCID.value + 705 ;
    
    public INTERNAL insBadSchemeName( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( INS_BAD_SCHEME_NAME, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.insBadSchemeName",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL insBadSchemeName( CompletionStatus cs ) {
        return insBadSchemeName( cs, null  ) ;
    }
    
    public INTERNAL insBadSchemeName( Throwable t ) {
        return insBadSchemeName( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL insBadSchemeName(  ) {
        return insBadSchemeName( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int INS_BAD_SCHEME_SPECIFIC_PART = SUNVMCID.value + 707 ;
    
    public INTERNAL insBadSchemeSpecificPart( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( INS_BAD_SCHEME_SPECIFIC_PART, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.insBadSchemeSpecificPart",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL insBadSchemeSpecificPart( CompletionStatus cs ) {
        return insBadSchemeSpecificPart( cs, null  ) ;
    }
    
    public INTERNAL insBadSchemeSpecificPart( Throwable t ) {
        return insBadSchemeSpecificPart( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL insBadSchemeSpecificPart(  ) {
        return insBadSchemeSpecificPart( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int INS_OTHER = SUNVMCID.value + 708 ;
    
    public INTERNAL insOther( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( INS_OTHER, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "NAMING.insOther",
                parameters, NamingSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL insOther( CompletionStatus cs ) {
        return insOther( cs, null  ) ;
    }
    
    public INTERNAL insOther( Throwable t ) {
        return insOther( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL insOther(  ) {
        return insOther( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    
}
