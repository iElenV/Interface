public class KitchenBoss {
    private ILogger _logger;

    public KitchenBoss(ILogger _logger) {
        this._logger = _logger;
    }

    public void MakeDinner (ICook food){
        _logger.Log("Начало готовки");
        food.Cook();
        _logger.Log("Конец готовки");
    }

}
