/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hebertferreira
 */
public class ConfiguracaoGeral {
    
    private String capacidadeMaxCemiterio;    
    private String totalEnterrados;
    private String permiteTamparBuracoVazio;

    public String getCapacidadeMaxCemiterio() {
        return capacidadeMaxCemiterio;
    }

    public void setCapacidadeMaxCemiterio(String capacidadeMaxCemiterio) {
        this.capacidadeMaxCemiterio = capacidadeMaxCemiterio;
    }

    public String getTotalEnterrados() {
        return totalEnterrados;
    }

    public void setTotalEnterrados(String totalEnterrados) {
        this.totalEnterrados = totalEnterrados;
    }

    public String getPermiteTamparBuracoVazio() {
        return permiteTamparBuracoVazio;
    }

    public void setPermiteTamparBuracoVazio(String permiteTamparBuracoVazio) {
        this.permiteTamparBuracoVazio = permiteTamparBuracoVazio;
    }

}
