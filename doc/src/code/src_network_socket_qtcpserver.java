/*   Ported from: src.network.socket.qtcpserver.cpp
<snip>
//! [0]
        server->setProxy(QNetworkProxy::NoProxy);
//! [0]


</snip>
*/
import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class src_network_socket_qtcpserver {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
        server.setProxy(QNetworkProxy.NoProxy);
//! [0]


    }
}